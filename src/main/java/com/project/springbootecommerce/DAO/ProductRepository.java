package com.project.springbootecommerce.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.springbootecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
