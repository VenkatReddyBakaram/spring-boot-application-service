package com.vtech.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class AccountBean {

	public AccountBean() {
		System.out.println("AccountBean object is created....!");
	}

	public void accountDetails() {
		System.out.println("Account No : 1234");
		System.out.println("Account Holder : Venkat Reddy Bakaram");
		System.out.println("Balance : 5000000.00");
	}
}
