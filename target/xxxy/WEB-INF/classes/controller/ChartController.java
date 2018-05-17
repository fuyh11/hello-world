package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.servlet.ServletUtilities;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.codehaus.jackson.map.ObjectMapper;
import po.Order;
import po.Product;
import service.impl.OrderServiceImpl;

@Controller
@RequestMapping("/chart/")
public class ChartController {

	@Resource(name="orderServiceImpl")
	private OrderServiceImpl orderService;

	@RequestMapping("TestServlet.action")
	@ResponseBody
	public void getProduct(HttpServletResponse response,HttpServletRequest request) throws IOException{
		List<Product> list = new ArrayList<Product>();
		//这里把“类别名称”和“销量”作为两个属性封装在一个Product类里，每个Product类的对象都可以看作是一个类别（X轴坐标值）与销量（Y轴坐标值）的集合
		list.add(new Product("衬衣", 10));
		list.add(new Product("短袖", 20));
		list.add(new Product("大衣", 30));

		ObjectMapper mapper = new ObjectMapper();    //提供java-json相互转换功能的类

		String json = mapper.writeValueAsString(list);    //将list中的对象转换为Json格式的数组

		//将json数据返回给客户端
		response.setContentType("text/html; charset=utf-8");
		response.getWriter().write(json);
	}
	@RequestMapping("pile.action")
	@ResponseBody
	public void getPile(HttpServletResponse response,HttpServletRequest request) throws IOException{
		List<Order> list=orderService.getOrderMoney();
		ObjectMapper mapper = new ObjectMapper();    //提供java-json相互转换功能的类
		String json = mapper.writeValueAsString(list);    //将list中的对象转换为Json格式的数组
		//将json数据返回给客户端
		response.setContentType("text/html; charset=utf-8");
		response.getWriter().write(json);
	}
}
