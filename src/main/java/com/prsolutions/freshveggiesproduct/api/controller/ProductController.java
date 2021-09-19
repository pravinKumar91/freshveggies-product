package com.prsolutions.freshveggiesproduct.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prsolutions.freshveggiesproduct.api.model.Product;
import com.prsolutions.freshveggiesproduct.api.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	public ProductService productService;
	
	@RequestMapping("/id/{productId}")
	public Product getProductInfoById(@PathVariable("productId") long productId) {
		return productService.getProductById(productId);
	}
	
	@PostMapping("/add/product")
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	
	@RequestMapping("/name/{productName}")
	public List<Product> getProductInfoByName(@PathVariable("productName") String strProductName){
		return productService.getProductInfoByName(strProductName);
	}
	
	@RequestMapping("/all")
	public List<Product> getAllProducts(){
		return productService.getAllProduct();
	}
}
