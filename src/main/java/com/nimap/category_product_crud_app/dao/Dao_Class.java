package com.nimap.category_product_crud_app.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nimap.category_product_crud_app.dto.Category;
import com.nimap.category_product_crud_app.dto.Product;
import com.nimap.category_product_crud_app.repository.Category_Repository;
import com.nimap.category_product_crud_app.repository.Product_Repository;

@Repository
public class Dao_Class {
	@Autowired
	private Category_Repository category_Repository;
	
	@Autowired
	private Product_Repository product_Repository;
	
	public void saveCategory(Category category) {
		category_Repository.save(category);
	}

	public Optional<Category> getCategory(int id) {
		return category_Repository.findById(id);
	}

	public void deleteCategory(int id) {
		category_Repository.deleteById(id);
	}

	public void updateCategory(int id, Category category) {
		category.setId(id);
		category_Repository.save(category);
	}
	
	public void saveProduct(Product product) {
		product_Repository.save(product);
	}
	
	public Product getProduct(int id) {
		return product_Repository.findById(id);
	}
	
	public void deleteProduct(int id) {
		product_Repository.deleteById(id);
	}
	
	public void updateProduct(int id, Product product) {
		product.setPid(id);
		product_Repository.save(product);
	}
}
