package com.ebcho.swimtalk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebcho.swimtalk.domain.Region;
import com.ebcho.swimtalk.repository.RegionRepository;

@Service
public class RegionService {

	@Autowired
	RegionRepository regionRepository;

	public List<Region> getRegions(long upperId) {
		return regionRepository.findByUpperId(upperId);
	}
}
