package com.trabfinal.mservice2.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.trabfinal.mservice2.model.User;
import com.trabfinal.mservice2.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> autentifyUser(@RequestBody User user) {
		ResponseEntity<?> response;
		user = userService.autentifyUser(user);
		if(user != null) {
			response = new ResponseEntity<>(user, HttpStatus.OK);
		}else {
			response = new ResponseEntity<>(HttpStatus.FORBIDDEN);
		}
		
		return response;
	}	
}
