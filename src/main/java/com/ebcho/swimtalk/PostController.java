package com.ebcho.swimtalk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/post")
public class PostController {

	@Autowired
	private PostService postService;

	@PostMapping
	public String writePost(@RequestParam String title, @RequestParam String content) {
		postService.writePost(title, content);
		return "redirect:/";
	}
}
