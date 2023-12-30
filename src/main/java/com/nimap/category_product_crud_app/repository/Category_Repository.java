package com.nimap.category_product_crud_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nimap.category_product_crud_app.dto.Category;

public interface Category_Repository extends JpaRepository<Category, Integer>{

}
