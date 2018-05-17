package service.impl;

import mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.Order;
import po.OrderExample;
import service.OrderService;

import java.util.List;

@Service("orderServiceImpl")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper mapper;

    @Override
    public Order getOrder(Integer orderId) {
        return mapper.selectByPrimaryKey(orderId);
    }

    @Override
    public List<Order> getAllOrder(Order order) {
        OrderExample example = new OrderExample();
        OrderExample.Criteria criteria = example.createCriteria();
        if(order!=null){
            if(order.getPileId()!=null&&(!order.getPileId().equals(""))){
                criteria.andPileIdLike("%"+order.getPileId()+"%");
            }
            if(order.getOrderPhone()!=null&&(!order.getOrderPhone().equals(""))){
                criteria.andOrderPhoneLike("%"+order.getOrderPhone()+"%");
            }
        }
        return mapper.selectByExample(example);
    }

    @Override
    public boolean deleteOrder(Integer orderId) {
        int i = mapper.deleteByPrimaryKey(orderId);
        if(i>0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean updateOrder(Order order) {
        try{
            int i = mapper.updateByPrimaryKey(order);
            if(i>0) {
                return true;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Order> getOrderMoney() {
        return mapper.getOrderMoney();
    }

    @Override
    public List<Order> getuser(String orderPhone) {
        return mapper.getuser(orderPhone);
    }

    @Override
    public List<Order> getpile(String pileId) {
        return mapper.getpile(pileId);
    }
}
