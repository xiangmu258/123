package ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	//测试
	
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView mv=new ModelAndView("user/hello");
		return mv;
	}
}
