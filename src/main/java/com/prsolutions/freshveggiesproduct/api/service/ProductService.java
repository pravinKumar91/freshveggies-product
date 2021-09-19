package com.prsolutions.freshveggiesproduct.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prsolutions.freshveggiesproduct.api.dao.ProductRepository;
import com.prsolutions.freshveggiesproduct.api.model.Product;

@Service
public class ProductService {

	@Autowired
	public ProductRepository productRepository;
	
	/**
	 * get product information, by id
	 * @author pravinK
	 * @param productId
	 * @return
	 */
	public Product getProductById(long productId){
		return productRepository.findById(productId).get();
	}
	
	/**
	 * find product, by name as substring with ignore case
	 * @author pravinK
	 * @param strProductName
	 * @return
	 */
	public List<Product> getProductInfoByName(String strProductName){
		return productRepository.findByProductNameContainingIgnoreCase(strProductName);
	}
	
	/**
	 * get all products as list
	 * @author pravinK
	 * @return
	 */
	public List<Product> getAllProduct(){
		return productRepository.findAll();
	}
	
	/**
	 * This method will add new product in global database list
	 * @author pravinK
	 * @param product
	 * @return
	 */
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}	
}
