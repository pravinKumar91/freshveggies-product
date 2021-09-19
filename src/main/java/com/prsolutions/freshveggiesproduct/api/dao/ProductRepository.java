package com.prsolutions.freshveggiesproduct.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prsolutions.freshveggiesproduct.api.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

	List<Product> findByProductNameContainingIgnoreCase(String strProductName);
}
