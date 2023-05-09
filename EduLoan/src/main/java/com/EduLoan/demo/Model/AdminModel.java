package com.EduLoan.demo.Model;



public class AdminModel {

	private String email;
	private String password;
	private String mobileNumber;
	private String userRole;
	
	public AdminModel() {
		super();
	}
	public AdminModel(String email, String password, String mobileNumber, String userRole) {
		super();
		this.email = email;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.userRole = userRole;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	@Override
	public String toString() {
		return "AdminModel [email=" + email + ", password=" + password + ", mobileNumber=" + mobileNumber
				+ ", userRole=" + userRole + "]";
	}
	
}
