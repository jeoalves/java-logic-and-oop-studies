package com.productapi.repository;

import com.productapi.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryProduct extends JpaRepository <Product, Long> {

	
}
