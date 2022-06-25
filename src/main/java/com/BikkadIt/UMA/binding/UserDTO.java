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
	

}
