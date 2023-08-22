package com.ebcho.swimtalk.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ebcho.swimtalk.domain.User;
import com.ebcho.swimtalk.repository.UserRepository;

@Service
public class UserService {
	private UserRepository userRepository;
	public void login(String username, String email, String snsId) {
		User user = userRepository.findbyEmail(email).orElse(new User(username, email, snsId));
		userRepository.save(user);
	}
}
