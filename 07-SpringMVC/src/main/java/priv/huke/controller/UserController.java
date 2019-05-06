package priv.huke.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@RequestMapping("listUser")
	public ModelAndView listUser() {

		ModelAndView mdAndView = new ModelAndView();

		// 设置数据模型,相当于request的setAttribute方法，实质上，底层确实也是转成了request（暂时这样理解）
		// 先将k/v数据放入map中，最终根据视图对象不同，再进行后续处理
        mdAndView.addObject("msg", "欢迎来到springmvc");

		// 设置视图(逻辑路径)
        mdAndView.setViewName("/WEB-INF/jsp/listUser.jsp");

		return mdAndView;
	}

}
