package com.vtech.dtos;

import java.util.List;

public class BranchDTO {

	private Integer branchId;
	private String branchName;
	private String branchLocation;

	private List<AccountDTO> account;

	public BranchDTO(Integer branchId, String branchName, String branchLocation, List<AccountDTO> account) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.branchLocation = branchLocation;
		this.account = account;
	}

	public Integer getBranchId() {
		return branchId;
	}

	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchLocation() {
		return branchLocation;
	}

	public void setBranchLocation(String branchLocation) {
		this.branchLocation = branchLocation;
	}

	public List<AccountDTO> getAccount() {
		return account;
	}

	public void setAccount(List<AccountDTO> account) {
		this.account = account;
	}
}