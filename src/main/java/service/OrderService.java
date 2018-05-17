package service;

import po.Order;

import java.util.List;

public interface OrderService {

    public Order getOrder(Integer orderId);

    public List<Order> getAllOrder(Order order);

    public boolean deleteOrder(Integer orderId);

    public boolean updateOrder(Order order);

    List<Order> getOrderMoney();

    List<Order> getuser(String orderPhone);

    List<Order>  getpile(String pileId);
}
