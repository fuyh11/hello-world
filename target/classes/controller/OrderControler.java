package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import po.Charge;
import po.Order;
import po.UserInfo;
import service.ChargeService;
import service.OrderService;
import service.UserService;
import utils.ParseDate;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("/order/")
public class OrderControler {
    @Resource(name="orderServiceImpl")
    private OrderService orderService;

    @Resource(name="chargeServiceImpl")
    private ChargeService chargeService;

    @Resource(name="userServiceImpl")
    private UserService userService;

    @RequestMapping("list.action")
    public String list(Order order, Model model){
        List<Order> order_list = orderService.getAllOrder(order);
        model.addAttribute("order_list",order_list);
        return "order/orderlist";
    }
    @RequestMapping("chargelist.action")
    public String list(Charge charge, Model model){
        List<Charge> charge_list = chargeService.getAllCharge(charge);
        if(!charge_list.isEmpty()){
            for(Charge charge1:charge_list){
                if(charge1.getChargeDate()!=null){
                    charge1.setChargedate_str(ParseDate.getString(charge1.getChargeDate()));
                }
            }
        }
        model.addAttribute("charge_list",charge_list);
        return "order/chargelist";
    }

    @RequestMapping("load.action")
    public String loadUpdate(Integer orderId,Model model){
        Order order = orderService.getOrder(orderId);
        model.addAttribute("order",order);
        return "order/orderupdate";
    }

    @RequestMapping("update.action")
    public String update(Order order,Model model){
        boolean a = orderService.updateOrder(order);
        if(a) {
            model.addAttribute("info","修改成功");
        }else {
            model.addAttribute("info","修改失败");
        }
        List<Order> order_list = orderService.getAllOrder(null);
        model.addAttribute("order_list",order_list);
        return "order/orderlist";
    }

    @RequestMapping("delete.action")
    public String delete(Integer orderId,Model model){
        boolean a = orderService.deleteOrder(orderId);
        if(a) {
            model.addAttribute("info","删除成功");
        }else {
            model.addAttribute("info","删除失败");
        }
        List<Order> order_list = orderService.getAllOrder(null);
        model.addAttribute("order_list",order_list);
        return "order/orderlist";
    }

    @RequestMapping("refund.action")
    public String refund(Integer orderId,Model model){
        Order order = orderService.getOrder(orderId);
        UserInfo user = userService.getUser(order.getOrderPhone());
        if(order.getOrderStatus().equals("退款申请")){
            long money = order.getOrderMoney().longValue();
            long balance = money+user.getUserBalance();
            user.setUserBalance(balance);
            userService.updateUser(user);
            order.setOrderStatus("已退款");
            orderService.updateOrder(order);
            model.addAttribute("info","退款成功");
            model.addAttribute("order_list",order);
            model.addAttribute("userList",user);
        }
        List<Order> order_list = orderService.getAllOrder(null);
        model.addAttribute("order_list",order_list);
        return "order/orderlist";
    }
}
