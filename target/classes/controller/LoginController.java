package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import po.Admins;
import service.AdminsService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/")
public class LoginController {
	@Resource(name = "adminsServiceImpl")
	private AdminsService service;

	@RequestMapping("login")
	public String login(Admins admins, HttpServletRequest request, Model model){
		List<Admins> list = service.getAllAdmins(admins);
		if(list.isEmpty()){
			model.addAttribute("info","用户名或密码不正确");
			return "login";
		}else {
			Admins adminLogin=list.get(0);
			HttpSession session = request.getSession();
			session.setAttribute("aname",adminLogin.getAname());     //用Session保存用户名
			session.setAttribute("aid",adminLogin.getAid());
			return "index";
		}

	}

}
