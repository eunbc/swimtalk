package com.ebcho.swimtalk.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class User {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private String username;
	private String email;
	private String snsType = "naver";
	private String snsId;
	private LocalDateTime createTime;

	protected User() {}

	public User(String username, String email, String snsId) {
		this.username = username;
		this.email = email;
		this.snsId = snsId;
	}
}
