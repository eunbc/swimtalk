package com.ebcho.swimtalk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
	@Autowired
	private PostRepository postRepository;

	public Iterable<Post> getAllPosts() {
		return postRepository.findAll();
	}
}
