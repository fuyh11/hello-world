package controller;

import javafx.css.ParsedValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import po.Address;
import po.Staffs;
import service.AddressService;
import service.StaffService;
import utils.GetNum;
import utils.ParseDate;

import javax.annotation.Resource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/staff/")
public class StaffController {
    @Resource(name="staffServiceImpl")
    private StaffService staffService;

	@Resource(name="addressServiceImpl")
	private AddressService addressService;

    @RequestMapping("list.action")
    public String list(Staffs staffs, Model model){
        List<Staffs> staff_list = staffService.getAllStaff(staffs);
        if(!staff_list.isEmpty()) {
        	for(Staffs staff:staff_list) {
        		if(staff.getStaffBirthday()!=null) {
        			staff.setBirthday_str(ParseDate.getString(staff.getStaffBirthday()));
        		}
        		if(staff.getStaffEntryTime()!=null) {
        			staff.setEntryTime_str(ParseDate.getString(staff.getStaffEntryTime()));
        		}
        	}
        }
        model.addAttribute("staff_list", staff_list);
        return "staff/stafflist";
    }

    @RequestMapping("getParam.action")
	public String getParam(Staffs staffs, Model model){
    	List<Address> address_list = addressService.getAllAddress(null);
		model.addAttribute("address_list",address_list);
		return "staff/staffadd";
	}
   
    @RequestMapping(value = "add.action")
    public String add(Staffs staffs,Model model){
		Staffs staffs1 = new Staffs();
		int num = staffService.getAllStaff(staffs1).size();
		String staffId = (GetNum.getNum(num+1));
		staffs1.setStaffId(staffId);
    	if(staffs.getBirthday_str()!=null) {
    		try {
				staffs.setStaffBirthday(new SimpleDateFormat("yyyy-MM-dd").parse(staffs.getBirthday_str()));
			} catch (ParseException e) {
				e.printStackTrace();
			}
    	}
    	if(staffs.getEntryTime_str()!=null) {
    		try {
				staffs.setStaffEntryTime(new SimpleDateFormat("yyyy-MM-dd").parse(staffs.getEntryTime_str()));
			} catch (ParseException e) {
				e.printStackTrace();
			}
    	}
        boolean i = staffService.addStaff(staffs);
        if(i){
            model.addAttribute("info", "添加成功");
        }else {
        	model.addAttribute("info", "添加失败");
        	model.addAttribute("staff",staffs);
        }
        List<Staffs> staff_list = staffService.getAllStaff(null);
        if(!staff_list.isEmpty()) {
        	for(Staffs staff:staff_list) {
        		if(staff.getStaffBirthday()!=null) {
        			staff.setBirthday_str(ParseDate.getString(staff.getStaffBirthday()));
        		}
        		if(staff.getStaffEntryTime()!=null) {
        			staff.setEntryTime_str(ParseDate.getString(staff.getStaffEntryTime()));
        		}
        	}
        }
        model.addAttribute("staff_list", staff_list);
        return "staff/stafflist";
    }
    
    @RequestMapping("load.action")
	public String loadUpdate(String staffId,Model model) {
		List<Address> address_list = addressService.getAllAddress(null);
		model.addAttribute("address_list",address_list);
    	Staffs staffs = staffService.getStaff(staffId);
    	if(staffs.getStaffBirthday()!=null){
    	staffs.setBirthday_str(ParseDate.getString(staffs.getStaffBirthday()));
    	}
    	if(staffs.getStaffEntryTime()!=null){
			staffs.setEntryTime_str(ParseDate.getString(staffs.getStaffEntryTime()));
		}

    	model.addAttribute(staffs);
    	return "staff/staffupdate";
    	
    }
    @RequestMapping("update.action")
    public String update(Staffs staffs,Model model) {
		if(staffs.getBirthday_str()!=null) {
			try {
				staffs.setStaffBirthday(new SimpleDateFormat("yyyy-MM-dd").parse(staffs.getBirthday_str()));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		if(staffs.getEntryTime_str()!=null) {
			try {
				staffs.setStaffEntryTime(new SimpleDateFormat("yyyy-MM-dd").parse(staffs.getEntryTime_str()));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
    	boolean a = staffService.updateStaff(staffs);
    	model.addAttribute(staffs);
    	if(a) {
    		model.addAttribute("info","修改成功");
    	}else {
    		model.addAttribute("info","修改失败");
		}
    	List<Staffs> staff_list = staffService.getAllStaff(null);
        if(!staff_list.isEmpty()) {
        	for(Staffs staff:staff_list) {
        		if(staff.getStaffBirthday()!=null) {
        			staff.setBirthday_str(ParseDate.getString(staff.getStaffBirthday()));
        		}
        		if(staff.getStaffEntryTime()!=null) {
        			staff.setEntryTime_str(ParseDate.getString(staff.getStaffEntryTime()));
        		}
        	}
        }
        model.addAttribute("staff_list", staff_list);
        return "staff/stafflist";
    }
    @RequestMapping("delete.action")
    public String delete(String staffId,Model model) {
    	boolean a =staffService.deleteStaff(staffId);
    	if(a) {
    		model.addAttribute("info","删除成功");
    	}else {
    		model.addAttribute("info","删除失败");
    	}
    	List<Staffs> staff_list = staffService.getAllStaff(null);
        if(!staff_list.isEmpty()) {
        	for(Staffs staff:staff_list) {
        		if(staff.getStaffBirthday()!=null) {
        			staff.setBirthday_str(ParseDate.getString(staff.getStaffBirthday()));
        		}
        		if(staff.getStaffEntryTime()!=null) {
        			staff.setEntryTime_str(ParseDate.getString(staff.getStaffEntryTime()));
        		}
        	}
        }
        model.addAttribute("staff_list", staff_list);
        return "staff/stafflist";
    }
}
