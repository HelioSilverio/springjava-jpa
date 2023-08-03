package com.silverio.Curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.silverio.Curso.entities.Order;
import com.silverio.Curso.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order>findAll(){
	return repository.findAll();
	}
	public Order findById(Long id) {
		Optional<Order> Obj=repository.findById(id);
		return Obj.get();
	}
}
