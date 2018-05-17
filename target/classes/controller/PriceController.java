package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import po.Price;
import service.PriceService;

import javax.annotation.Resource;

@Controller
@RequestMapping("/price/")
public class PriceController {
    @Resource(name="priceServiceImpl")
    private PriceService priceService;

    @RequestMapping("load.action")
    public String loadup(Integer priceId, Model model){
        Price price = priceService.getPrice(1);
        model.addAttribute("price",price);
        return "price/price";
    }

    @RequestMapping("update.action")
    public String update(Price price,Model model){
        boolean a = priceService.update(price);
        model.addAttribute("price",price);
        if(a) {
            model.addAttribute("info","修改成功");
        }else {
            model.addAttribute("info","修改失败");
        }
        return "price/price";
    }
}
