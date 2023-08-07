package com.ebcho.swimtalk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ebcho.swimtalk.domain.Post;
import com.ebcho.swimtalk.repository.PostRepository;

@Service
public class PostService {
	@Autowired
	private PostRepository postRepository;

	public Iterable<Post> getAllPosts() {
		return postRepository.findAllByOrderByIdDesc();
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
}
