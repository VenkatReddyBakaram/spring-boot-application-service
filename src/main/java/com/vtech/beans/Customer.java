package com.vtech.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Customer {

	@Autowired
	private Address address1;

	@Autowired
	private Address address2;

	@Autowired
	@Qualifier("prod")
	private Product prodA;

	@Autowired
	@Qualifier("prod")
	private Product prodB;

	public Customer() {
		System.out.println("Customer object is created...!");
	}

	public void customerDetails() {
		System.out.println("Customer ID : 1234");
		System.out.println("Customer Name : John");
		address1.addressDetails();
		address2.addressDetails();
		prodA.productDetails();
		prodB.productDetails();
	}

}
