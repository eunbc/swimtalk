package com.ebcho.swimtalk.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Pool {
	@Id
	private String id;
	private String name;

	private String address;
	private String telephone;
	private String link;

	private Integer mapX;
	private Integer mapY;

	private Long regionId;
}
