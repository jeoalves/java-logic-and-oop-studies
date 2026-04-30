package com.productapi.service;

import com.productapi.model.Product;
import com.productapi.repository.RepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceProduct {
	@Autowired
	private RepositoryProduct repositoryProduct;
	
	public List<Product> listAll(){
		return repositoryProduct.findAll();
	}
	
	public Product save(Product product) {
		return repositoryProduct.save(product);
	}
	
	public void delete(Long id) {
		repositoryProduct.deleteById(id);
	}
	
	public Product update(Long id, Product product) {
		if(repositoryProduct.existsById(id)) {
			product.setId(id);
			return repositoryProduct.save(product);
		}else {
			throw new RuntimeException("Product not found");
		}
	}
	
	public Optional<Product> findById(Long id){
		return repositoryProduct.findById(id);
	}

}
