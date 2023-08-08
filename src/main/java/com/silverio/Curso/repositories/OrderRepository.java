package com.silverio.Curso.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.silverio.Curso.entities.Order;



public interface OrderRepository extends JpaRepository<Order, Long> {

	

}
