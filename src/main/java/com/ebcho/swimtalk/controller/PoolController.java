package com.ebcho.swimtalk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String getPoolList(@RequestParam long regionId, Model model) {
		model.addAttribute("pools",poolService.getPools(regionId));
		return "pool/list";
	}

	@GetMapping("/{poolId}")
	public String getPool(@PathVariable String poolId, Model model) {
		model.addAttribute("pool",poolService.getPool(poolId));
		return "pool/detail";
	}


}
