package com.estore.application.v1.models;

import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long productID;

	private String productName;

	private double productCost;

	private String productDescription;

	private String productType;

	private Set<String> productTags;

	public long getProductID() {
		return productID;
	}

	public void setProductID(long productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductCost() {
		return productCost;
	}

	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Set<String> getProductTags() {
		return productTags;
	}

	public void setProductTags(Set<String> productTags) {
		this.productTags = productTags;
	}

	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", productCost=" + productCost
				+ ", productDescription=" + productDescription + ", productType=" + productType + ", productTags="
				+ productTags + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(productID, productName, productType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return productID == other.productID && Objects.equals(productName, other.productName)
				&& Objects.equals(productType, other.productType);
	}

}
