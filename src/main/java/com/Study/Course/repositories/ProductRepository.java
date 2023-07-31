package com.Study.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Study.Course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
