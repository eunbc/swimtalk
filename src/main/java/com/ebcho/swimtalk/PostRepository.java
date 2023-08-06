package com.ebcho.swimtalk;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Integer> {
	List<Post> findAllByOrderByIdDesc();
}
