package com.Git.Demo.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Git.Demo.Dto.UserReqDto;
import com.Git.Demo.Entity.User;
import com.Git.Demo.Repository.UserRepository;
import com.Git.Demo.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public ResponseEntity<?> createUser(UserReqDto userReqDto) {

		User user = new User();

		user.setUserId(userReqDto.getUserId());
		user.setName(userReqDto.getName());
		user.setDescription(userReqDto.getDescription());
		userRepository.save(user);

		return new ResponseEntity<>("User Saved Successfully", HttpStatus.OK);
	}

}
