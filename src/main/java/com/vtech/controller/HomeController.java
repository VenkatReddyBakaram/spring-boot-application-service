package com.vtech.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vtech.dtos.AccountDTO;
import com.vtech.dtos.BankDTO;
import com.vtech.dtos.BranchDTO;
import com.vtech.dtos.ProductDTO;
import com.vtech.service.ConstantsTest;
import com.vtech.service.TestI;

@Controller
@RequestMapping("/home")
public class HomeController {

	@Autowired
	@Qualifier(ConstantsTest.val)
	private TestI testI;

	@RequestMapping("/homeService")
	@ResponseBody
	public String homeService() {
		System.out.println("Request is Captured....!");
		return testI.test();
	}

	@RequestMapping("/indexService")
	public String indexService() {
		return "index";
	}

	@RequestMapping("/getProduct")
	@ResponseBody
	public ProductDTO getProduct() {
		ProductDTO productDTO = new ProductDTO(1234, "Computer", 54000.50, true, 5);
		return productDTO;
	}

	@RequestMapping("/getProducts")
	@ResponseBody
	public List<ProductDTO> getProducts() {
		ProductDTO productDTO1 = new ProductDTO(1234, "Computer", 54000.50, true, 5);
		ProductDTO productDTO2 = new ProductDTO(1235, "Television", 64000.50, true, 10);
		ProductDTO productDTO3 = new ProductDTO(1236, "Music System", 44000.50, true, 15);

		List<ProductDTO> listOfProducts = new ArrayList<ProductDTO>();

		listOfProducts.add(productDTO1);
		listOfProducts.add(productDTO2);
		listOfProducts.add(productDTO3);

		return listOfProducts;
	}

	@RequestMapping("/getBankDetails")
	@ResponseBody
	public BankDTO getBankDetails() {

		AccountDTO account1 = new AccountDTO(12345, "John", 450000.50, "Savings");
		AccountDTO account2 = new AccountDTO(12346, "Smith", 540000.50, "Current");
		AccountDTO account3 = new AccountDTO(12347, "Miller", 630000.50, "Corporate");

		List<AccountDTO> listOfAccounts1 = new ArrayList<AccountDTO>();
		listOfAccounts1.add(account1);
		listOfAccounts1.add(account2);
		listOfAccounts1.add(account3);

		AccountDTO account4 = new AccountDTO(12348, "Venkat", 450000.50, "Savings");
		AccountDTO account5 = new AccountDTO(12349, "Jessicca", 540000.50, "Current");
		AccountDTO account6 = new AccountDTO(12350, "Reddy", 630000.50, "Corporate");

		List<AccountDTO> listOfAccounts2 = new ArrayList<AccountDTO>();
		listOfAccounts2.add(account4);
		listOfAccounts2.add(account5);
		listOfAccounts2.add(account6);

		BranchDTO branch1 = new BranchDTO(100, "ICICI-B1", "Hyderabad", listOfAccounts1);
		BranchDTO branch2 = new BranchDTO(101, "ICICI-B2", "Bangalore", listOfAccounts2);

		List<BranchDTO> listOfBranches = new ArrayList<BranchDTO>();
		listOfBranches.add(branch1);
		listOfBranches.add(branch2);

		BankDTO bankDTO = new BankDTO("ICICI", listOfBranches);

		return bankDTO;

	}

}