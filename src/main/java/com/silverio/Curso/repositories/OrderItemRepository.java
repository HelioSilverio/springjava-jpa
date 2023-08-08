package com.silverio.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.silverio.Curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long>{
	
	

}
