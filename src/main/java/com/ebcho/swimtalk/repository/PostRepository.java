package com.ebcho.swimtalk.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ebcho.swimtalk.domain.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
	List<Post> findAllByOrderByIdDesc();
}
