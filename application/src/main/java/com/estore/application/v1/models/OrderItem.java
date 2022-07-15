package com.estore.application.v1.models;

import java.util.Objects;

import javax.persistence.ManyToOne;

public class OrderItem {

	private long orderItemID;

	private Cart itemTaggedToCart;
	@ManyToOne
	private long cartID;

	private Product itemTypeOfProduct;
	private long produuctID;
	// 3 red cars -- 1st item, 5 blue pencils -- 2nd Item
	private int orderItemCount;

	private double costPerItem;

	public long getOrderItemID() {
		return orderItemID;
	}

	public void setOrderItemID(long orderItemID) {
		this.orderItemID = orderItemID;
	}

	public Cart getItemTaggedToCart() {
		return itemTaggedToCart;
	}

	public void setItemTaggedToCart(Cart itemTaggedToCart) {
		this.itemTaggedToCart = itemTaggedToCart;
	}

	public long getCartID() {
		return cartID;
	}

	public void setCartID(long cartID) {
		this.cartID = cartID;
	}

	public Product getItemTypeOfProduct() {
		return itemTypeOfProduct;
	}

	public void setItemTypeOfProduct(Product itemTypeOfProduct) {
		this.itemTypeOfProduct = itemTypeOfProduct;
	}

	public long getProduuctID() {
		return produuctID;
	}

	public void setProduuctID(long produuctID) {
		this.produuctID = produuctID;
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
		return "OrderItem [orderItemID=" + orderItemID + ", itemTaggedToCart=" + itemTaggedToCart + ", cartID=" + cartID
				+ ", itemTypeOfProduct=" + itemTypeOfProduct + ", produuctID=" + produuctID + ", orderItemCount="
				+ orderItemCount + ", costPerItem=" + costPerItem + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cartID, orderItemCount, orderItemID, produuctID);
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
		return cartID == other.cartID && orderItemCount == other.orderItemCount && orderItemID == other.orderItemID
				&& produuctID == other.produuctID;
	}
	
	
}
