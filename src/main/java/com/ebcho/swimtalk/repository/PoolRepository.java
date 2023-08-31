package com.ebcho.swimtalk.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ebcho.swimtalk.domain.Pool;
import com.ebcho.swimtalk.domain.Region;

public interface PoolRepository extends CrudRepository<Pool, String> {
	List<Pool> findByRegionId(long regionId);

}
