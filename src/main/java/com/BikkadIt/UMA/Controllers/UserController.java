package com.BikkadIt.UMA.Controllers;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIt.UMA.Models.User;
import com.BikkadIt.UMA.Props.AppConstants;
import com.BikkadIt.UMA.Props.AppProperties;
import com.BikkadIt.UMA.Services.Userservice;
import com.BikkadIt.UMA.binding.UserDTO;



@RestController
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	private Userservice userService;
	@Autowired
	private AppProperties appProperties;
	
	@PostMapping("/")
	public ResponseEntity<UserDTO> createUser(@Valid @RequestBody UserDTO userDto){

		UserDTO createUser = this.userService.createUser(userDto);
		
		return new ResponseEntity<UserDTO>(createUser,HttpStatus.CREATED);
		
	}
	
	//Put - updateUser
	@PutMapping("/{userId}")
	public ResponseEntity<UserDTO> updateUser(@Valid @RequestBody UserDTO userDTO ,@PathVariable Integer userId){
		
		UserDTO updatedUser = this.userService.updateUser(userDTO, userId);
		return ResponseEntity.ok(updatedUser);
		
	}
	
	//delete -user
	@DeleteMapping("/{userId}")
	public ResponseEntity<?> deleteUser(@PathVariable Integer userId){
		Map<String,String> messages = appProperties.getMessages();
		
		this.userService.deleteUser(userId);
		
		
		
		return new ResponseEntity<String>(messages.get(AppConstants.DELETED),HttpStatus.OK);
		
	}
	
	//GET Singleuser get
	@GetMapping("/{userId}")
	public ResponseEntity<UserDTO> getsingleUser(@PathVariable Integer userId){
		
		
		return ResponseEntity.ok(this.userService.getSingleUser(userId));
	}
	
	//GET allUser
	
	@GetMapping("/")
	public ResponseEntity<List<UserDTO>> getAlluser(){
		
		return ResponseEntity.ok(this.userService.getAllUser());
	}
	
	
	
	

}
