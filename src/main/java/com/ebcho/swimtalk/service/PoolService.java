package com.ebcho.swimtalk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebcho.swimtalk.domain.Pool;
import com.ebcho.swimtalk.domain.Region;
import com.ebcho.swimtalk.repository.PoolRepository;
import com.ebcho.swimtalk.repository.RegionRepository;

@Service
public class PoolService {

	@Autowired
	PoolRepository poolRepository;

	public List<Pool> getPools(long regionId) {
		return poolRepository.findByRegionId(regionId);
	}
}
