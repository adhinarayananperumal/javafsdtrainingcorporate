package com.icici.sampleprojectspringbootmicroservices.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Table(name = "icici_user1")
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int userId;

	@Column(name="user_full_name")
	String userFullName;
	
	@Column(name="password")
	String password;
	
	@OneToMany(mappedBy="user",cascade = CascadeType.ALL)
	List<LoginHistory> loginHistory;
	
	LocalDateTime lastLoginTimeStamp;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserFullName() {
		return userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<LoginHistory> getLoginHistory() {
		return loginHistory;
	}

	public void setLoginHistory(List<LoginHistory> loginHistory) {
		this.loginHistory = loginHistory;
	}

	public LocalDateTime getLastLoginTimeStamp() {
		return lastLoginTimeStamp;
	}

	public void setLastLoginTimeStamp(LocalDateTime lastLoginTimeStamp) {
		this.lastLoginTimeStamp = lastLoginTimeStamp;
	}

				
	
}