package controller;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebParam.Mode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import po.Address;
import service.AddressService;
import utils.GetNum;

@Controller
@RequestMapping("/address/")
public class AddressController {
	@Resource(name="addressServiceImpl")
	private AddressService addressService;
	
	@RequestMapping("list.action")
	public String list(Address address,Model model) {
		List<Address> address_list = addressService.getAllAddress(address);
		model.addAttribute("address_list",address_list);
		return "address/addresslist";
	}
	
	 @RequestMapping("add.action")
	 public String add(Address address,Model model) {
		Address address1 = new Address();
		int num = addressService.getAllAddress(address1).size();
		String areaid = GetNum.getNum(num+1);
		address.setAreaid(areaid);
		 boolean a = addressService.addAddress(address);
		 model.addAttribute("address",address);
		 if(a){
	            model.addAttribute("info", "添加成功");	           
	        }else {
	        	model.addAttribute("info", "添加失败");
	           
	        }
		 List<Address> address_list = addressService.getAllAddress(null);
		 model.addAttribute("address_list",address_list);
		 return "address/addresslist";
	 }
	 
	 @RequestMapping("load.action")
	 public String loadUpdate(String areaid,Model model) {
		Address address = addressService.getAddress(areaid);
		model.addAttribute("address",address);
		return "address/addressupdate";
	 }
	 
	 @RequestMapping("update.action")
	    public String update(Address address,Model model) {
		 boolean a = addressService.updateAddress(address);
		 if(a) {
	            model.addAttribute("info","修改成功");
	        }else {
	            model.addAttribute("info","修改失败");           
	      }
		 List<Address> address_list = addressService.getAllAddress(null);
		 model.addAttribute("address_list",address_list);
		 return "address/addresslist";
		 
	 }
	 
	 @RequestMapping("delete.action")
	    public String delete(String areaid,Model model) {
		 boolean a = addressService.deleteAddress(areaid);
		 if(a) {
	            model.addAttribute("info","删除成功");         
	        }else {
	            model.addAttribute("info","删除失败");         
	      }
		 List<Address> address_list = addressService.getAllAddress(null);
		 model.addAttribute("address_list",address_list);
		 return "address/addresslist";
	 }
	 
}
