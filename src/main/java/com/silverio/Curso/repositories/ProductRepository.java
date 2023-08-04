package com.silverio.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.silverio.Curso.entities.Product;


public interface ProductRepository extends JpaRepository<Product,Long>{
	
	

}
