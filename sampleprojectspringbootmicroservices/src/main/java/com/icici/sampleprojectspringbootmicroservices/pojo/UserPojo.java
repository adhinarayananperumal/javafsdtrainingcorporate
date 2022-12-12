package com.icici.sampleprojectspringbootmicroservices.pojo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.icici.sampleprojectspringbootmicroservices.entity.LoginHistory;

public class UserPojo {
	
	private int userId;
	private String userFullName;
	private String password;
	LocalDateTime lastLoginTimeStamp;
	
	List<LoginHistory> listLoginHistory = new ArrayList();

	
	public List<LoginHistory> getListLoginHistory() {
		return listLoginHistory;
	}
	public void setListLoginHistory(List<LoginHistory> listLoginHistory) {
		this.listLoginHistory = listLoginHistory;
	}
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
	public LocalDateTime getLastLoginTimeStamp() {
		return lastLoginTimeStamp;
	}
	public void setLastLoginTimeStamp(LocalDateTime lastLoginTimeStamp) {
		this.lastLoginTimeStamp = lastLoginTimeStamp;
	}
	
	
				

}
