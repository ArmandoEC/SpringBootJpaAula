package com.aulaSpring.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaSpring.aula.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
