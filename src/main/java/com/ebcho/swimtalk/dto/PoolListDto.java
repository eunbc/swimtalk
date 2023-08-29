package com.ebcho.swimtalk.dto;

import java.util.ArrayList;
import java.util.List;

import com.ebcho.swimtalk.domain.Pool;
import com.ebcho.swimtalk.domain.Region;

import lombok.Getter;
import lombok.ToString;

@Getter
public class PoolListDto {
	private Region region;
	private List<Pool> poolList = new ArrayList<>();

	public PoolListDto(Region province, Region city, List<Pool> poolList) {
		this.region = new Region(city.getId(), province.getName() + " " + city.getName(), province.getId());
		this.poolList.addAll(poolList);
	}
}
