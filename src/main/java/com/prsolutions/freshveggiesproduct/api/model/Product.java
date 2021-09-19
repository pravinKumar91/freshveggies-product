package com.prsolutions.freshveggiesproduct.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@SequenceGenerator(
			name = "product_sequence",
			sequenceName = "product_sequene",
			allocationSize = 1
		)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "product_sequence"
		)
	private long productId;
	
	private String productName;
	private String productDescription;
	private String productImageURL;
		
	public Product() {
		super();
	}

	public Product(long productId, String productName, String productDescription, String productImageURL) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productImageURL = productImageURL;
	}

	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductImageURL() {
		return productImageURL;
	}
	public void setProductImageURL(String productImageURL) {
		this.productImageURL = productImageURL;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", productImageURL=" + productImageURL + "]";
	}
}
