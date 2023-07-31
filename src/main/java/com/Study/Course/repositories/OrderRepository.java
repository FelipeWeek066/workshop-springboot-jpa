package com.Study.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Study.Course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
