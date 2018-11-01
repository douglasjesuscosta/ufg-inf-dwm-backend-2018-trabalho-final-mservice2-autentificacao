package com.trabfinal.mservice2.repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trabfinal.mservice2.model.User;

@Repository
public interface UserRepositoryIA extends CrudRepository<User, Integer> {
	
	@Query(value = "SELECT * FROM users u where u.email = :email AND u.senha = :senha", 
	        nativeQuery=true)
	public List<User> findByEmailAndSenha(String email, String senha);
	
}
