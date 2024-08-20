package com.vtech.dtos;

import java.util.List;

public class BankDTO {

	private String bankName;
	private List<BranchDTO> branch;

	public BankDTO(String bankName, List<BranchDTO> branch) {
		super();
		this.bankName = bankName;
		this.branch = branch;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public List<BranchDTO> getBranch() {
		return branch;
	}

	public void setBranch(List<BranchDTO> branch) {
		this.branch = branch;
	}
}