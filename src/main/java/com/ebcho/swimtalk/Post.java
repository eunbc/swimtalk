package com.ebcho.swimtalk;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class Post {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private String title;
	private String author;
	private LocalDateTime createTime;
	private Long views;
}
