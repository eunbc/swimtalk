package com.ebcho.swimtalk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ebcho.swimtalk.domain.Pool;
import com.ebcho.swimtalk.domain.Region;
import com.ebcho.swimtalk.service.PoolService;
import com.ebcho.swimtalk.service.RegionService;

@RestController
@RequestMapping("/pool")
public class PoolController {

	@Autowired
	PoolService poolService;

	@GetMapping
	public List<Pool> getPools(@RequestParam long regionId) {
		return poolService.getPools(regionId);
	}


}
