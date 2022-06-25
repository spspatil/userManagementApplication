package com.BikkadIt.UMA.Services;

import java.util.List;

import com.BikkadIt.UMA.Models.User;
import com.BikkadIt.UMA.binding.UserDTO;

public interface Userservice {
	
	
	//create
	UserDTO createUser(UserDTO user);
	
	//update 
	UserDTO updateUser(UserDTO user, Integer userId);
	
	//getsingle User
	
	UserDTO getSingleUser(Integer userId);
	
	//get all user
    List<UserDTO> getAllUser();
	
    //deleteuser
	void deleteUser(Integer userId);

	
	
	

}
