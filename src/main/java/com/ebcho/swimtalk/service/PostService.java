package com.ebcho.swimtalk.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ebcho.swimtalk.domain.Post;
import com.ebcho.swimtalk.repository.PostRepository;

@Service
public class PostService {
	@Autowired
	private PostRepository postRepository;

	public Page<Post> getAllPosts(int page, int size) {
		Pageable pageable = PageRequest.of(page, size, Sort.by(Sort.Direction.DESC, "id"));
		return postRepository.findAllByIsDeletedFalseOrderByIdDesc(pageable);
	}
	public void writePost(String title, String content) {
		Post post = new Post(title, content);
		postRepository.save(post);
	}

	@Transactional
	public Post readPost(Long id) {
		Post post = postRepository.findById(id).orElseThrow();
		post.viewCountUp();
		return post;
	}
	public Post readPostForUpdate(Long id) {
		return postRepository.findById(id).orElseThrow();
	}

	@Transactional
	public Post updatePost(Long id, String title, String content) {
		Post post = postRepository.findById(id).orElseThrow();
		post.update(title,content);
		return post;
	}

	@Transactional
	public void deletePost(Long id) {
		Post post = postRepository.findById(id).orElseThrow();
		post.delete();
	}
}
