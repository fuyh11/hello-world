package controller;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebParam.Mode;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mchange.v2.async.StrandedTaskReporting;

import po.StaffFeedback;
import po.UserFeedback;
import service.StaffFeedbackService;
import service.UserFeedbackService;

@Controller
@RequestMapping("/feedback/")
public class FeedbackController {
	@Resource(name="staffFeedbackServiceImpl")
	private StaffFeedbackService staffFeedbackService;
	
	@Resource(name="userFeedbackServiceImpl")
	private UserFeedbackService userFeedbackService;
	
	@RequestMapping("stafflist.action")
	public String list(StaffFeedback staffFeedback,Model model) {
		List<StaffFeedback> sf_list = staffFeedbackService.getAllStaffFeedback(staffFeedback);
		model.addAttribute("sf_list", sf_list);
		return "feedback/stafffeedback";
	}
	@RequestMapping("userlist.action")
	public String list(UserFeedback userFeedback,Model model) {
		List<UserFeedback> uf_list = userFeedbackService.getAllUserFeedback(userFeedback);
		model.addAttribute("uf_list",uf_list);
		return "feedback/userfeedback";
	}

	@RequestMapping("sfdelete.action")
	public String delete1(Integer feedbackId, Model model){
		boolean a = staffFeedbackService.deleteSF(feedbackId);
		if(a) {
			model.addAttribute("info","删除成功");
		}else {
			model.addAttribute("info","删除失败");
		}
		List<StaffFeedback> sf_list = staffFeedbackService.getAllStaffFeedback(null);
		model.addAttribute("sf_list", sf_list);
		return "feedback/stafffeedback";
	}
	@RequestMapping("sfload.action")
	public String sfload(Integer feedbackId, Model model){
		StaffFeedback staffFeedback = staffFeedbackService.getsf(feedbackId);
		model.addAttribute("staffFeedback",staffFeedback);
		return "feedback/sfupdate";
	}

	@RequestMapping("sfupdate.action")
	public String update1(StaffFeedback staffFeedback,Model model,HttpServletRequest request){
		HttpSession session=request.getSession();
		int aid = (int) session.getAttribute("aid");
		staffFeedback.setAdminId(aid);
		boolean a = staffFeedbackService.updateSF(staffFeedback);
		if(a) {
			model.addAttribute("info","修改成功");
		}else {
			model.addAttribute("info","修改失败");
		}
		List<StaffFeedback> sf_list = staffFeedbackService.getAllStaffFeedback(null);
		model.addAttribute("sf_list", sf_list);
		return "feedback/stafffeedback";
	}

	@RequestMapping("ufload.action")
	public String ufload(Integer feedbackId, Model model){
		UserFeedback userFeedback = userFeedbackService.getuf(feedbackId);
		model.addAttribute("userFeedback",userFeedback);
		return "feedback/ufupdate";
	}
	@RequestMapping("ufupdate.action")
	public String update2(UserFeedback userFeedback,Model model,HttpServletRequest request){
		HttpSession session = request.getSession();
		int aid = (int) session.getAttribute("aid");
		userFeedback.setAdminId(aid);
		boolean a = userFeedbackService.updateUF(userFeedback);
		if(a) {
			model.addAttribute("info","修改成功");
		}else {
			model.addAttribute("info","修改失败");
		}
		List<UserFeedback> uf_list = userFeedbackService.getAllUserFeedback(null);
		model.addAttribute("uf_list",uf_list);
		return "feedback/userfeedback";
	}
	@RequestMapping("ufdelete.action")
	public String delete2(Integer feedbackId, Model model){
		boolean a = userFeedbackService.deleteUF(feedbackId);
		if(a) {
			model.addAttribute("info","删除成功");
		}else {
			model.addAttribute("info","删除失败");
		}
		List<UserFeedback> uf_list = userFeedbackService.getAllUserFeedback(null);
		model.addAttribute("uf_list",uf_list);
		return "feedback/userfeedback";
	}

	

}
