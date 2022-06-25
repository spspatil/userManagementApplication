package com.BikkadIt.UMA.ServicesIMPL;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIt.UMA.Models.User;
import com.BikkadIt.UMA.Repositories.UserRepo;
import com.BikkadIt.UMA.Services.Userservice;
import com.BikkadIt.UMA.binding.UserDTO;

@Service
public class UserServiceIMPL implements Userservice{
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public UserDTO createUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		
		User user = this.modelMapper.map(userDTO, User.class);
		
		
		User save = this.userRepo.save(user);
		return this.modelMapper.map(save, UserDTO.class);
	}

	@Override
	public UserDTO updateUser(UserDTO userDTO, Integer userId) {
		// TODO Auto-generated method stub
		User user=this.userRepo.findById(userId).get();
		
		user.setUserFirstName(userDTO.getUserFirstName());
		user.setUserLastName(userDTO.getUserLastName());
		user.setUserEmail(userDTO.getUserEmail());
		user.setUserPhNo(userDTO.getUserPhNo());
		user.setGender(userDTO.getGender());
		user.setUserDOB(userDTO.getUserDOB());
		user.setUserCountry(userDTO.getUserCountry());
		user.setUserState(userDTO.getUserState());
		user.setUserCity(userDTO.getUserCity());
		
		User save = this.userRepo.save(user);
		
		return this.modelMapper.map(save, UserDTO.class);
	}

	@Override
	public UserDTO getSingleUser(Integer userId) {
		// TODO Auto-generated method stub
		User user = this.userRepo.findById(userId).get();
		
		return this.modelMapper.map(user, UserDTO.class);
	}

	@Override
	public List<UserDTO> getAllUser() {
		// TODO Auto-generated method stub
		
		List<User> users = this.userRepo.findAll();
		List<UserDTO> userDtos = users.stream().map((user)-> this.modelMapper.map(user, UserDTO.class)).collect(Collectors.toList());
		
		return userDtos;
	}

	@Override
	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub
		
		Optional<User> user = this.userRepo.findById(userId);
		
		if(user.isPresent()) {
			
			this.userRepo.delete(user.get());
			
		}
		
	}

	
}
