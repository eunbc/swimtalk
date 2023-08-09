package com.ebcho.swimtalk.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.ebcho.swimtalk.domain.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
	Page<Post> findAllByIsDeletedFalseOrderByIdDesc(Pageable pageable);
}
