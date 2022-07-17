package com.estore.application.v1.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class OrderItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long orderItemId;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private Cart cartIdFk;

	@OneToOne
	private Product productIdFk;
	// 3 red cars -- 1st item, 5 blue pencils -- 2nd Item

	@Column(nullable = false)
	private int orderItemCount;

	private double costPerItem;

	public long getOrderItemID() {
		return orderItemId;
	}

	public void setOrderItemID(long orderItemID) {
		this.orderItemId = orderItemID;
	}

	public Cart getCartID() {
		return cartIdFk;
	}

	public void setCartID(Cart cartID) {
		this.cartIdFk = cartID;
	}

	public Product getProductID() {
		return productIdFk;
	}

	public void setProductID(Product produuctID) {
		this.productIdFk = produuctID;
	}

	public int getOrderItemCount() {
		return orderItemCount;
	}

	public void setOrderItemCount(int orderItemCount) {
		this.orderItemCount = orderItemCount;
	}

	public double getCostPerItem() {
		return costPerItem;
	}

	public void setCostPerItem(double costPerItem) {
		this.costPerItem = costPerItem;
	}

	@Override
	public String toString() {
		return "OrderItem [orderItemID=" + orderItemId + ", cartID=" + cartIdFk + ", productID=" + productIdFk
				+ ", orderItemCount=" + orderItemCount + ", costPerItem=" + costPerItem + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cartIdFk, costPerItem, orderItemCount, orderItemId, productIdFk);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(cartIdFk, other.cartIdFk)
				&& Double.doubleToLongBits(costPerItem) == Double.doubleToLongBits(other.costPerItem)
				&& orderItemCount == other.orderItemCount && orderItemId == other.orderItemId
				&& Objects.equals(productIdFk, other.productIdFk);
	}



}
