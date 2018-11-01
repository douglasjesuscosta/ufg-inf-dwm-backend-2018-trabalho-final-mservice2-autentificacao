package com.trabfinal.mservice2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.trabfinal.mservice2.model.User;
import com.trabfinal.mservice2.repository.UserRepositoryIA;

@Service
public class UserService{
	
	@Autowired
	private UserRepositoryIA userRepository;

	public User autentifyUser(User user) {
		
		List<User> users = userRepository.findByEmailAndSenha(user.getEmail(), user.getSenha());
		
		if(!users.isEmpty()) {
			user = users.get(0);
		}
		
		return user;
	}
}