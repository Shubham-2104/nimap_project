package com.nimap.category_product_crud_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nimap.category_product_crud_app.dto.Product;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Product_Repository extends JpaRepository<Product, Integer>{
	@Query("select p from Product p where id=:pid")
	Product findById(@Param(value = "pid") int id);
}
