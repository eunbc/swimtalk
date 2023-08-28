package com.ebcho.swimtalk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

	@GetMapping("/search")
	public String searchList() {
		return "pool/list";
	}
}
