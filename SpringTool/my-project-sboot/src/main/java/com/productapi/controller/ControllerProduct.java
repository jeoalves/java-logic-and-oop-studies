package com.productapi.controller;

import com.productapi.model.Product;
import com.productapi.service.ServiceProduct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ControllerProduct {
	@Autowired
	private ServiceProduct serviceProduct;
	
	@GetMapping
	public List<Product> listAll(){
		return serviceProduct.listAll();
	}
	
	@PostMapping
	public Product save(@RequestBody Product product) {
		return serviceProduct.save(product);
	}
	
	@PutMapping("/{id}")
	public Product update(@PathVariable Long id, @RequestBody Product product) {
		return serviceProduct.update(id, product);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		serviceProduct.delete(id);
	}
	
}
