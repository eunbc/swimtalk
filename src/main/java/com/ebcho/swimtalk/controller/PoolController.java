package com.ebcho.swimtalk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ebcho.swimtalk.service.PoolService;
import com.ebcho.swimtalk.service.RegionService;

@Controller
@RequestMapping("/pool")
public class PoolController {

	@Autowired
	PoolService poolService;
	@Autowired
	RegionService regionService;

	@GetMapping
	public String searchList(@RequestParam long regionId, Model model) {
		model.addAttribute("pools",poolService.getPools(regionId));
		return "pool/list";
	}


}
