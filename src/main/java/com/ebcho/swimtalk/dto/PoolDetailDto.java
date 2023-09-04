package com.ebcho.swimtalk.dto;

import java.util.ArrayList;
import java.util.List;

import com.ebcho.swimtalk.domain.Pool;
import com.ebcho.swimtalk.domain.Region;

import lombok.Getter;

@Getter
public class PoolDetailDto {
	private String id;
	private String name;

	private String address;
	private String telephone;
	private String link;

	private Long regionId;

	public PoolDetailDto(Pool pool) {
		this.id = pool.getId();
		this.name = pool.getName();
		this.address = pool.getAddress();
		this.telephone = pool.getTelephone();
		this.link = pool.getLink();
		this.regionId = pool.getRegionId();
	}
}
