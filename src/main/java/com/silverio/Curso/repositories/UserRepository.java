package com.silverio.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.silverio.Curso.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{
	
	

}
