package com.silverio.Curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.silverio.Curso.entities.Product;
import com.silverio.Curso.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product>findAll(){
	return repository.findAll();
	}
	public Product findById(Long id) {
		Optional<Product> Obj=repository.findById(id);
		return Obj.get();
	}
}
