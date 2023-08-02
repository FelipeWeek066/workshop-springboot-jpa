package com.Study.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Study.Course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
