package com.ecoms.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;




@Component
@Entity
public class Cart  {
	
	@Id
	@GeneratedValue
	int citemid;
	
	
	@NotNull
	int productId;
	

	
	@NotNull
	String userName;
	
	@Column
	String productName;
	@Column
	String productUnitPrice;
	
	@Column
	int productQuantity;
	
	
	


	public int getCitemid() {
		return citemid;
	}



	public void setCitemid(int citemid) {
		this.citemid = citemid;
	}



	public String getUserName() {
		return userName;
	}

	

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getProductId() {
		return productId;
	}
	
	



	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductUnitPrice() {
		return productUnitPrice;
	}
	
	
	public void setProductUnitPrice(String productUnitPrice) {
		this.productUnitPrice = productUnitPrice;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	

}
