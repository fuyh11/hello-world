import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import po.Admins;
import service.AdminsService;

import javax.annotation.Resource;
@Controller
@RequestMapping("/admin/")
public class ss {
    @Resource(name = "adminsServiceImpl")
    private AdminsService adminsService;

    @RequestMapping(value = "profile.action", method = RequestMethod.GET)
    public Admins getAdmin(String aname) {
        Admins admins = adminsService.getAdmin(aname);
        System.out.println("yonghuming" + admins.getAname() + "mima" + admins.getApass());
        return admins;
    }
}