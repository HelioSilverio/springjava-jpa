package com.silverio.Curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.silverio.Curso.entities.OrderItem;
import com.silverio.Curso.repositories.OrderItemRepository;

@Service
public class OrderItemService {

	@Autowired
	private OrderItemRepository repository;
	
	public List<OrderItem>findAll(){
	return repository.findAll();
	}
	public OrderItem findById(Long id) {
		Optional<OrderItem> Obj=repository.findById(id);
		return Obj.get();
	}
}
