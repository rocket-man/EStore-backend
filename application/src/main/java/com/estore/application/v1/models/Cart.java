package com.estore.application.v1.models;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@OneToOne
	private User taggedUser;

	@OneToMany
	private List<OrderItem> items;

	private double cartTotal;

	public User getTaggedUser() {
		return taggedUser;
	}

	public void setTaggedUser(User taggedUser) {
		this.taggedUser = taggedUser;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	public double getCartTotal() {
		// try list.stream to add item.costPerItem
		cartTotal  += this.items.iterator().next().getCostPerItem();
		//.forEach((item) -> item.getCostPerItem());
		return cartTotal;
	}

	public void setCartTotal(double cartTotal) {
		this.cartTotal = cartTotal;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", taggedUser=" + taggedUser + ", items=" + items + ", cartTotal=" + cartTotal + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, taggedUser);
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
		return id == other.id && Objects.equals(taggedUser, other.taggedUser);
	}

}
