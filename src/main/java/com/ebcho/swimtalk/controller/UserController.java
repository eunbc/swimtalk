package com.ebcho.swimtalk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ebcho.swimtalk.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	private UserService userService;

	@GetMapping("/login")
	public String loginView(Model model) {
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

	@PostMapping("/login")
	public String login(@RequestParam String username,
		@RequestParam String email,
		@RequestParam String snsId, Model model) {
		userService.login(username, email, snsId);
		return "index";
	}
}
