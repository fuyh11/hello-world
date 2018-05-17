package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import po.Admins;
import service.AdminsService;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin/")
public class AdminController {
    @Resource(name = "adminsServiceImpl")
    private AdminsService adminsService;

    @RequestMapping(value = "profile.action", method = RequestMethod.GET)
    public String getAdmin(Admins admins,Model model,@RequestParam("aname") String  aname, HttpServletRequest request){
        HttpSession session = request.getSession();
        aname = session.getAttribute("aname").toString();
        admins = adminsService.getAdmin(aname);
        model.addAttribute("admins",admins);
        return "admin/profile";
    }
    @RequestMapping("add.action")
    public String add(Admins admins, Model model){
        boolean a = adminsService.addAdmin(admins);
        model.addAttribute("admins",admins);
        if(a){
            model.addAttribute("info", "添加成功");
        }else {
        	 model.addAttribute("info", "添加失败");
        }
        List<Admins> adminList  = adminsService.getAllAdmins(null);
        model.addAttribute("adminList",adminList);
    	return "admin/adminlist";
    }
    
    @RequestMapping("list.action")
    public String list(Admins admins, Model model){
        List<Admins> adminList = adminsService.getAllAdmins(admins);
        model.addAttribute("adminList",adminList);
        return "admin/adminlist";
    }
    
    @RequestMapping("load.action")
    public String loadUpdate(Integer aid,Model model) {
    	Admins admins = adminsService.getAdm(aid);
    	model.addAttribute("admins",admins);
    	return "admin/adminupdate";
    }
    
    @RequestMapping("update.action")
    public String update(Admins admins, Model model) {
    	 boolean a = adminsService.updateAdmin(admins);
         if(a) {
             model.addAttribute("info","修改成功");
         }else {
             model.addAttribute("info","修改失败");           
         }
         List<Admins> adminList = adminsService.getAllAdmins(null);
         model.addAttribute("adminList",adminList);
         return "admin/adminlist";
    }
    
    @RequestMapping("delete.action")
    public String delete(Integer aid,Model model){
        boolean a = adminsService.deleteAdmin(aid);
        if(a) {
            model.addAttribute("info","删除成功");         
        }else {
            model.addAttribute("info","删除失败");         
        }
        List<Admins> adminList = adminsService.getAllAdmins(null);
        model.addAttribute("adminList",adminList);
        return "admin/adminlist";
    }
    
    @RequestMapping(value = "modifPass.action")
    public String modifPass(Model model,String oldpass,String newpass,String configpass,HttpServletRequest request){
        Admins ad=adminsService.getAdmin((String)request.getSession().getAttribute("aname"));
        if(!newpass.equals(configpass)){
            model.addAttribute("admins",ad);
            model.addAttribute("info","两次密码不一致，请重新输入");
            return "admin/profile";
        }else{
            HttpSession session = request.getSession();
            String aname=(String)session.getAttribute("aname");
            Admins admins = new Admins();
            admins.setAname(aname);
            admins.setApass(oldpass);
            List<Admins> list=adminsService.getAllAdmins(admins);
            if(list.size()>0){
                admins=list.get(0);
                admins.setApass(newpass);
                adminsService.updateAdmin(admins);
                model.addAttribute("info","更改密码成功");
                model.addAttribute("admins",ad);
                return "/admin/profile";
            }else{
                model.addAttribute("info", "密码输入错误");
                model.addAttribute("admins",ad);
                return "/admin/profile";
            }
        }
    }
}
