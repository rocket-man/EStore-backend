package com.estore.application.v1.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cartId;

	@OneToOne
	@JsonIgnore
	private User userIdFk;

	@OneToMany(mappedBy = "cartIdFk")
	private List<OrderItem> items = new ArrayList<>();

	private double cartTotal;

	private String cartStatus;

	public User getUserID() {
		return userIdFk;
	}

	public void setUserID(User userID) {
		this.userIdFk = userID;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	public double getCartTotal() {
		// try list.stream to add item.costPerItem
		// cartTotal += this.items.iterator().next().getCostPerItem();
		// .forEach((item) -> item.getCostPerItem());
		return cartTotal;
	}

	public void setCartTotal(double cartTotal) {
		this.cartTotal = cartTotal;
	}

	public long getId() {
		return cartId;
	}

	public String getCartStatus() {
		return cartStatus;
	}

	public void setCartStatus(String cartStatus) {
		this.cartStatus = cartStatus;
	}

	@Override
	public String toString() {
		return "Cart [id=" + cartId + ", taggedUser=" + userIdFk + ", items=" + items + ", cartTotal=" + cartTotal + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cartId, userIdFk);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		return cartId == other.cartId && Objects.equals(userIdFk, other.userIdFk);
	}

}
