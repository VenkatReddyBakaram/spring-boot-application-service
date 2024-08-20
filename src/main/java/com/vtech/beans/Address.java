package com.vtech.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
@Scope("prototype")
public class Address {

	public Address() {
		System.out.println("Address object is created...!");
	}

	public void addressDetails() {
		System.out.println("Postal Code : 501506");
		System.out.println("State : Telangana");
		System.out.println("Country : India");
	}

}
