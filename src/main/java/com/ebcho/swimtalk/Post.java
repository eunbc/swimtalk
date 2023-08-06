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
	private String author = "작성자";
	private String content;
	private LocalDateTime createTime;
	private Long views = 0L;

	protected Post() {}

	Post(String title, String content) {
		this.title = title;
		this.content = content;
		this.createTime = LocalDateTime.now();
	}
}
