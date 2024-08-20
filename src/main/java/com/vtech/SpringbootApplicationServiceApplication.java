package com.vtech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vtech.beans.Customer;

@SpringBootApplication
public class SpringbootApplicationServiceApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringbootApplicationServiceApplication.class,
				args);

		// AccountBean accountBean = new AccountBean();

		/*
		 * AccountBean accountBean1 = context.getBean(AccountBean.class);
		 * accountBean1.accountDetails();
		 * 
		 * AccountBean accountBean2 = context.getBean(AccountBean.class);
		 * accountBean2.accountDetails();
		 * 
		 * AccountBean accountBean3 = context.getBean(AccountBean.class);
		 * accountBean3.accountDetails();
		 */

		Customer customer1 = context.getBean(Customer.class);
		customer1.customerDetails();

		Customer customer2 = context.getBean(Customer.class);
		customer2.customerDetails();
	}
}
