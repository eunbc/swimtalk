package com.ebcho.swimtalk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebcho.swimtalk.domain.Pool;
import com.ebcho.swimtalk.domain.Region;
import com.ebcho.swimtalk.dto.PoolListDto;
import com.ebcho.swimtalk.repository.PoolRepository;
import com.ebcho.swimtalk.repository.RegionRepository;

@Service
public class PoolService {

	@Autowired
	PoolRepository poolRepository;
	@Autowired
	RegionRepository regionRepository;

	public PoolListDto getPools(long regionId) {
		Region city = regionRepository.findById(regionId).orElseThrow();
		Region province = regionRepository.findById(city.getUpperId()).orElseThrow();
		List<Pool> poolList = poolRepository.findByRegionId(regionId);
		return new PoolListDto(province,city,poolList);
	}
}
