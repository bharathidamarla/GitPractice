package com.Git.Demo.Service;

import org.springframework.http.ResponseEntity;

import com.Git.Demo.Dto.UserReqDto;

public interface UserService {

	ResponseEntity<?> createUser(UserReqDto userReqDto);
 	
	ResponseEntity<?> getAllUsers();

}
