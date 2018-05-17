package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import po.Address;
import po.Order;
import po.Pile;
import po.Staffs;
import service.AddressService;
import service.OrderService;
import service.PileService;
import service.StaffService;
import utils.GetNum;
import utils.tostr;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/pile/")
public class PileController {
    @Resource(name ="pileServiceImpl")
    private PileService pileService;

    @Resource(name="orderServiceImpl")
    private OrderService orderService;
    
    @Resource(name="staffServiceImpl")
    private StaffService staffService;
    
    @Resource(name="addressServiceImpl")
	private AddressService addressService;

    private List<Staffs> staff_list = new ArrayList<>();
    
    private List<Address> address_list = new ArrayList<>();
    
    public void init() {
    	this.staff_list = staffService.getAllStaff(null);
    	this.address_list = addressService.getAllAddress(null);
    }
    @RequestMapping("list.action")
    public String list(Pile pile, Model model){
    	this.init();
        model.addAttribute("staff_list", this.staff_list);
		model.addAttribute("address_list",this.address_list);
        List<Pile> pile_list1 = pileService.getAllPile(pile);
        if(!pile_list1.isEmpty()){
            for(Pile p:pile_list1){
               p.setStatestr(tostr.getPileStateStr(p.getPileState()));
               p.setUsestatestr(tostr.getPileUseStateStr(p.getPileUseState()));
            }
        }
        model.addAttribute("pile_list", pile_list1);
        model.addAttribute("pile",pile);
        return "pile/pilelist";
    }

    @RequestMapping("add.action")
    public String add(Pile pile, Model model){
        Pile queryPile = new Pile();
        queryPile.setPileAreaid(pile.getPileAreaid());
        int num = pileService.getAllPile(queryPile).size();
        String pileId = "CD"+pile.getPileAreaid()+ GetNum.getNum(num+1);
        pile.setPileId(pileId);
        pile.setPilePassword("1234");
        boolean a = pileService.addPile(pile);
        if(a){
            model.addAttribute("info", "添加成功");         
        }else {
            model.addAttribute("pile",pile);
            model.addAttribute("info", "添加失败");
        }
        List<Pile> pile_list = pileService.getAllPile(null);
        if(!pile_list.isEmpty()){
            for(Pile p:pile_list){
                p.setStatestr(tostr.getPileStateStr(p.getPileState()));
                p.setUsestatestr(tostr.getPileUseStateStr(p.getPileUseState()));
            }
        }
        model.addAttribute("pile_list", pile_list);
        return "pile/pilelist";
    }

    @RequestMapping("getParam.action")
    public String getParam(Pile pile, Model model){
        this.init();
        model.addAttribute("staff_list", this.staff_list);
        model.addAttribute("address_list",this.address_list);
        return "pile/pileadd";
    }

    @RequestMapping("load.action")
	public String loadUpdate(String pileId,Model model) {
        this.init();
        model.addAttribute("staff_list", this.staff_list);
        model.addAttribute("address_list",this.address_list);
    	Pile pile = pileService.getPile(pileId);
    	model.addAttribute("pile",pile);
    	return "pile/pileupdate";
		
	}
    
    @RequestMapping("update.action")
    public String update(Pile pile,Model model) {
    	boolean a = pileService.updatePile(pile);
//    	model.addAttribute(pile);
    	if(a) {
    		model.addAttribute("info","修改成功");
    	}else {
    		model.addAttribute("info","修改失败");
		}
        List<Pile> pile_list1 = pileService.getAllPile(null);
        if(!pile_list1.isEmpty()){
            for(Pile p:pile_list1){
                p.setStatestr(tostr.getPileStateStr(p.getPileState()));
                p.setUsestatestr(tostr.getPileUseStateStr(p.getPileUseState()));
            }
        }
        model.addAttribute("pile_list", pile_list1);
        return "pile/pilelist";
    	
    }
    
    @RequestMapping("delete.action")
    public String delete(String pileId,Model model) {
    	boolean a = pileService.deletePile(pileId);
    	if(a) {
    		model.addAttribute("info","删除成功");
    	}else {
    		model.addAttribute("info","删除失败");
    	}
    	List<Pile> pile_list = pileService.getAllPile(null);     
        model.addAttribute("pile_list", pile_list);
        return "pile/pilelist";
    }

    @RequestMapping("show.action")
    public String showPile(String pileId,Model model){
       Pile pile = pileService.getPile(pileId);
       Order order = new Order();
       order.setPileId(pile.getPileId());
       pile.setStatestr(tostr.getPileStateStr(pile.getPileState()));
       pile.setUsestatestr(tostr.getPileUseStateStr(pile.getPileUseState()));
        model.addAttribute("pile",pile);
        List<Order> list=orderService.getpile(order.getPileId());
        model.addAttribute("order_list",list);
       return "pile/pileshow";
    }

}
