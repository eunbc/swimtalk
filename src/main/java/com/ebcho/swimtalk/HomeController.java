package com.ebcho.swimtalk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@Autowired
	private PostService postService;
	@GetMapping("/")
	String home(Model model) {
		//todo 리스트 담아서 리턴
		model.addAttribute("posts", postService.getAllPosts());
		return "index";
	}
}
