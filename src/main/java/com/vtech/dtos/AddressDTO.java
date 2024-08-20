package com.vtech.dtos;

public class AddressDTO {

	private String city;
	private String state;
	private Integer zipCode;

	public AddressDTO(String city, String state, Integer zipCode) {
		super();
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}
}