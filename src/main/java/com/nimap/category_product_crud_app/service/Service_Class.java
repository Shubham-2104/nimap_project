package com.nimap.category_product_crud_app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nimap.category_product_crud_app.dao.Dao_Class;
import com.nimap.category_product_crud_app.dto.Category;
import com.nimap.category_product_crud_app.dto.Product;

@Service
public class Service_Class {
	@Autowired
	private Dao_Class dao;
	
	public void saveCategory(Category category) {
		category.getProducts().forEach(i -> i.setCategory(category));
		dao.saveCategory(category);
	}

	public Optional<Category> getCategory(int id) {
		return dao.getCategory(id);
	}
	
	public void deleteCategory(int id) {
		dao.deleteCategory(id);
	}

	public void updateCategory(int id, Category category) {
		dao.updateCategory(id, category);
	}
	
	public void saveProduct(Product product) {
		dao.saveProduct(product);
	}
	
	public Product getProduct(int id) {
		return dao.getProduct(id);
	}
	
	public void deleteProduct(int id) {
		dao.deleteProduct(id);
	}
	
	public void updateProduct(int id, Product product) {
		dao.updateProduct(id, product);
	}
}
