package com.ebcho.swimtalk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ebcho.swimtalk.service.PostService;

@Controller
@RequestMapping("/post")
public class PostController {

	@Autowired
	private PostService postService;

	@GetMapping("/write")
	String writePost() {
		return "post/write";
	}

	@PostMapping
	public String writePost(@RequestParam String title, @RequestParam String content) {
		postService.writePost(title, content);
		return "redirect:/";
	}
	@GetMapping("/{id}")
	public String readPost(Model model,@PathVariable Long id) {
		model.addAttribute("post",postService.readPost(id));
		return "post/detail";
	}

	@GetMapping("/update/{id}")
	public String readPostForUpdate(Model model,@PathVariable Long id) {
		model.addAttribute("post",postService.readPostForUpdate(id));
		return "post/update";
	}

	@PostMapping("/update/{id}")
	public String updatePost(Model model,@PathVariable Long id, @RequestParam String title, @RequestParam String content) {
		model.addAttribute("post",postService.updatePost(id,title,content));
		return "post/detail";
	}

	@PostMapping("/delete/{id}")
	public String deletePost(@PathVariable Long id) {
		postService.deletePost(id);
		return "redirect:/";
	}


}
