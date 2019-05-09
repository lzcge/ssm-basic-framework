package com.lzcge.Controller;

import com.lzcge.Entity.User;
import com.lzcge.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value="/findUser",method= RequestMethod.GET)
	public String showUser(HttpServletRequest request, Model model){
		System.out.println("showname");
		List<User> user = userService.findUser();
		if(user != null){
			request.setAttribute("name",user.get(0).getUsername());
			model.addAttribute("mame", user.get(0).getUsername());
			return "showUser";
		}
		request.setAttribute("error", "没有找到该用户！");
		return "error";
	}

}
