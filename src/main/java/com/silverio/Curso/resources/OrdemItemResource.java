package com.silverio.Curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.silverio.Curso.entities.OrderItem;
import com.silverio.Curso.services.OrderItemService;


@RestController
@RequestMapping(value="/orderitem")

public class OrdemItemResource {
	
	@Autowired
	private OrderItemService service;
	@GetMapping
	public ResponseEntity<List<OrderItem>>findAll(){
//OrderItem u = new OrderItem(1L,"maria","maria@gmail.com","999999","12345");
		List<OrderItem> list=service.findAll();
		 return ResponseEntity.ok().body(list);
}
	@GetMapping(value="/{id}")
	public ResponseEntity<OrderItem>findById(@PathVariable Long id){

		OrderItem obj = service.findById(id);
		 return ResponseEntity.ok().body(obj);
}
}