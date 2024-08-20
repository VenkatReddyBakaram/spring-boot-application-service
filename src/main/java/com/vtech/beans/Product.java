package com.vtech.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("prod")
public class Product {

	public Product() {
		System.out.println("Product is created...!");
	}

	public void productDetails() {
		System.out.println("Product Name : Computer");
		System.out.println("Product Price : 540000.00");
	}

}
