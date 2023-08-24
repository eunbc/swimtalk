package com.ebcho.swimtalk.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.ebcho.swimtalk.domain.Post;
import com.ebcho.swimtalk.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	// Optional<User> findbyEmail(String email);
}
