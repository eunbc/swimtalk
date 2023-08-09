package com.ebcho.swimtalk.domain;

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
	private String author = "작성자";
	private String content;
	private LocalDateTime createTime;
	private Long views = 0L;
	private Boolean isDeleted = Boolean.FALSE;

	protected Post() {}

	public Post(String title, String content) {
		this.title = title;
		this.content = content;
		this.createTime = LocalDateTime.now();
	}

	public void viewCountUp() {
		this.views++;
	}
	public void update(String title, String content) {
		this.title = title;
		this.content = content;
	}

	public void delete() {
		this.isDeleted = Boolean.TRUE;
	}
}
