package com.ebcho.swimtalk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ebcho.swimtalk.domain.Post;
import com.ebcho.swimtalk.service.PostService;

@Controller
public class HomeController {

	@Autowired
	private PostService postService;
	@GetMapping("/")
	String home(Model model,
		@RequestParam(defaultValue = "0") int page,
		@RequestParam(defaultValue = "10") int size) {
		Page<Post> postPage = postService.getAllPosts(page,size);
		model.addAttribute("posts", postPage);
		return "index";
	}

}
