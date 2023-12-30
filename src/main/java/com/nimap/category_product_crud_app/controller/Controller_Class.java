package com.nimap.category_product_crud_app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nimap.category_product_crud_app.dto.Category;
import com.nimap.category_product_crud_app.dto.Product;
import com.nimap.category_product_crud_app.service.Service_Class;

@RestController
public class Controller_Class {
	@Autowired
	private Service_Class service;
	
	@PostMapping("/api/categories")
	public void saveCategory(@RequestBody Category category) {
		service.saveCategory(category);
	}
	
	@GetMapping("/api/categories/{di}")
	public Optional<Category> getCategory(@PathVariable("di") int id) {
		return service.getCategory(id);
	}
	
	@DeleteMapping("/api/categories/{di}") 
	public void deleteCategory(@PathVariable("di") int id) {
		service.deleteCategory(id);
	}
	
	@PutMapping("api/categories/{di}")
	public void updateCategory(@PathVariable("di") int id, @RequestBody Category category) {
		service.updateCategory(id, category);
	}
	
	@PostMapping("/api/products")
	public void saveProduct(@RequestBody Product product) {
		service.saveProduct(product);
	}
	
	@GetMapping("/api/products/{di}")
	public Product getProduct(@PathVariable("di") int id) {
		return service.getProduct(id);
	}
	
	@DeleteMapping("/api/products/{di}") 
	public void deleteProduct(@PathVariable("di") int id) {
		service.deleteProduct(id);
	}
	
	@PutMapping("/api/products/{di}")
	public void updateProduct(@PathVariable("di") int id, @RequestBody Product product) {
		service.updateProduct(id, product);
	}
	
}
