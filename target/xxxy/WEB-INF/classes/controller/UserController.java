package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import po.*;
import service.CarService;
import service.ChargeService;
import service.OrderService;
import service.UserService;
import utils.ParseDate;
import utils.tostr;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user/")
public class UserController {
    @Resource(name="userServiceImpl")
    private UserService userService;
    
    @Resource(name="carServiceImpl")
    private CarService carService;

    @Resource(name="orderServiceImpl")
    private OrderService orderService;

    @Resource(name="chargeServiceImpl")
    private ChargeService chargeService;

    @RequestMapping("list.action")
    public String list(UserInfo user, Model model){
        List<UserInfo> userList = userService.getAllUser(user);
        if(!userList.isEmpty()){
            for(UserInfo user1:userList){
                user1.setUserVip(tostr.getIsVipStr(user1.getUserIsVip()));
                user1.setUserAuthen(tostr.getAuthenStr(user1.getUserAuthentication()));
                user1.setUserLock(tostr.getLockStr(user1.getUserLockState()));
            }
        }
        model.addAttribute("userList",userList);
        return "user/userlist";
    }
    
    @RequestMapping("add.action")
    public String add(UserInfo user, Model model){
        boolean a = userService.addUser(user);
        model.addAttribute("user",user);
        if(a){
            model.addAttribute("info", "添加成功");
        }else {
        	 model.addAttribute("info", "添加失败");
        }
        List<UserInfo> userList = userService.getAllUser(null);
        if(!userList.isEmpty()){
            for(UserInfo user1:userList){
                user1.setUserVip(tostr.getIsVipStr(user1.getUserIsVip()));
                user1.setUserAuthen(tostr.getAuthenStr(user1.getUserAuthentication()));
                user1.setUserLock(tostr.getLockStr(user1.getUserLockState()));
            }
        }
        model.addAttribute("userList",userList);
        return "user/userlist";
    }
    @RequestMapping("load.action")
    public String loadUpdate(String userPhone,Model model){
        UserInfo user = userService.getUser(userPhone);
        model.addAttribute("user",user);
        return "user/userupdate";
    }
    @RequestMapping("update.action")
    public String update(UserInfo user,Model model){
        boolean a = userService.updateUser(user);
        if(a) {
            model.addAttribute("info","修改成功");
        }else {
            model.addAttribute("info","修改失败");           
        }
        List<UserInfo> userList = userService.getAllUser(null);
        if(!userList.isEmpty()){
            for(UserInfo user1:userList){
                user1.setUserVip(tostr.getIsVipStr(user1.getUserIsVip()));
                user1.setUserAuthen(tostr.getAuthenStr(user1.getUserAuthentication()));
                user1.setUserLock(tostr.getLockStr(user1.getUserLockState()));
            }
        }
        model.addAttribute("userList",userList);
        return "user/userlist";
    }
    
    @RequestMapping("delete.action")
    public String delete(String userPhone,Model model){
        boolean a = userService.deleteUser(userPhone);
        if(a) {
            model.addAttribute("info","删除成功");         
        }else {
            model.addAttribute("info","删除失败");         
        }
        List<UserInfo> userList = userService.getAllUser(null);
        model.addAttribute("userList",userList);
        return "user/userlist";
    }
    
    @RequestMapping("carlist.action")
    public String list(Car car, Model model){
    	List<Car> carList = carService.getAllCar(car);
        if(!carList.isEmpty()) {
            for (Car car1 : carList) {
                car1.setCarState_str(tostr.getCarStateStr(car1.getCarState()));
            }
        }
        model.addAttribute("carList",carList);
        return "user/carlist";
    }

    @RequestMapping("show.action")
    public String showUser(Phone phone, Model model){
        UserInfo user = new UserInfo();
        Order order = new Order();
        Charge charge = new Charge();
        if(phone.getCarPhone()!=null&&!phone.getCarPhone().trim().equals("")){
            user = userService.getUser(phone.getCarPhone());
        }else if(phone.getOrderPhone()!=null&&!phone.getOrderPhone().trim().equals("")){
            user = userService.getUser(phone.getOrderPhone());
        }else{
            user=userService.getUser(phone.getUserPhone());
        }
        order.setOrderPhone(user.getUserPhone());
        charge.setUserPhone(user.getUserPhone());
        user.setUserVip(tostr.getIsVipStr(user.getUserIsVip()));
        user.setUserAuthen(tostr.getAuthenStr(user.getUserAuthentication()));
        user.setUserLock(tostr.getLockStr(user.getUserLockState()));
        model.addAttribute("user",user);
        List<Order> list=orderService.getuser(order.getOrderPhone());
        model.addAttribute("order_list",list);
        return "user/usershow";
    }

}
