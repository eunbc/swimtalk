package com.ebcho.swimtalk.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ebcho.swimtalk.domain.Pool;
import com.ebcho.swimtalk.domain.Region;
import com.ebcho.swimtalk.domain.User;

public interface RegionRepository extends CrudRepository<Region, Long> {
	List<Region> findByUpperId(long upperId);

}
