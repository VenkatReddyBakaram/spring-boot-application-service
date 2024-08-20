package com.vtech.dtos;

public class AccountDTO {

	private Integer accountNo;
	private String accountHolder;
	private Double balance;
	private String accountType;

	public AccountDTO(Integer accountNo, String accountHolder, Double balance, String accountType) {
		super();
		this.accountNo = accountNo;
		this.accountHolder = accountHolder;
		this.balance = balance;
		this.accountType = accountType;
	}

	public Integer getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
}