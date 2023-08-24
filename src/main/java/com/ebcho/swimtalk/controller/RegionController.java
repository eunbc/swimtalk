package com.ebcho.swimtalk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ebcho.swimtalk.domain.Region;
import com.ebcho.swimtalk.service.RegionService;

@RestController
@RequestMapping("/region")
public class RegionController {

	@Autowired
	RegionService regionService;

	@GetMapping
	public List<Region> getRegions(@RequestParam(defaultValue = "0") long upperId) {
		return regionService.getRegions(upperId);
	}


}
