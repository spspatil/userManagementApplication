package com.BikkadIt.UMA.binding;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserDTO {
	
private Integer userId;
	
	@NotEmpty
	@Size(min = 4 ,max = 10,message = "Firstname shoudbe minium 3 chars and amximum 10 chars")
	private String userFirstName;
	
	@NotEmpty
	@Size(min = 4 ,max = 10,message = "lastname shoudbe minium 3 chars and amximum 10 chars")
	private String userLastName;
	
	@Email
	private String userEmail;
	@NotEmpty
	private String userPhNo;
	@NotEmpty
	private String userDOB;
	@NotEmpty
	private String gender;
	@NotEmpty
	private String userCountry;
	@NotEmpty
	private String userState;
	@NotEmpty
	private String userCity;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPhNo() {
		return userPhNo;
	}
	public void setUserPhNo(String userPhNo) {
		this.userPhNo = userPhNo;
	}
	public String getUserDOB() {
		return userDOB;
	}
	public void setUserDOB(String userDOB) {
		this.userDOB = userDOB;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUserCountry() {
		return userCountry;
	}
	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}
	public String getUserState() {
		return userState;
	}
	public void setUserState(String userState) {
		this.userState = userState;
	}
	public String getUserCity() {
		return userCity;
	}
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	

	
}
