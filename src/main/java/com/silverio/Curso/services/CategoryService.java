package com.silverio.Curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.silverio.Curso.entities.Category;
import com.silverio.Curso.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category>findAll(){
	return repository.findAll();
	}
	public Category findById(Long id) {
		Optional<Category> Obj=repository.findById(id);
		return Obj.get();
	}
}
