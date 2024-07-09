package com.Git.Demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Git.Demo.Dto.UserReqDto;
import com.Git.Demo.Service.UserService;

@RestController
@RequestMapping("/Users")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/create")
	public ResponseEntity<?> createUser(@RequestBody UserReqDto userReqDto) {
		return userService.createUser(userReqDto);
	}

	@GetMapping
	public ResponseEntity<?> getAllUsers() {
		return userService.getAllUsers();

	}

}
