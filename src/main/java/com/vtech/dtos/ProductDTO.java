package com.vtech.dtos;

public class ProductDTO {

	private Integer productId;
	private String productName;
	private Double price;
	private Boolean isVerifiedProduct;
	private Integer quantity;

	public ProductDTO(Integer productId, String productName, Double price, Boolean isVerifiedProduct,
			Integer quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.isVerifiedProduct = isVerifiedProduct;
		this.quantity = quantity;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Boolean getIsVerifiedProduct() {
		return isVerifiedProduct;
	}

	public void setIsVerifiedProduct(Boolean isVerifiedProduct) {
		this.isVerifiedProduct = isVerifiedProduct;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}