package com.estore.application.v1.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userID;

	private String userName;

	private String password;

	private String userType;

	@OneToOne
	private Cart cartIdFk;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Cart getTaggedCart() {
		return cartIdFk;
	}

	public void setTaggedCart(Cart cartID) {
		this.cartIdFk = cartID;
	}

	public long getUserID() {
		return userID;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", userType=" + userType + ", taggedCart="
				+ cartIdFk + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(password, userID, userName, userType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(password, other.password) && userID == other.userID
				&& Objects.equals(userName, other.userName) && Objects.equals(userType, other.userType);
	}

}
