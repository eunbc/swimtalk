package com.ebcho.swimtalk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("clientId","Xq8HpB_odW0EfIu2kpYq");
		model.addAttribute("callbackUrl","http://localhost:8080/user/oauth");
		model.addAttribute("serviceUrl","http://localhost:8080");
		return "user/login";
	}

	@GetMapping("/oauth")
	public String oauth(Model model) {
		model.addAttribute("clientId","Xq8HpB_odW0EfIu2kpYq");
		model.addAttribute("callbackUrl","http://localhost:8080/user/oauth");
		return "user/callback";
	}
}
