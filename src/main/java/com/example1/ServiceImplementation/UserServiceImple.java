package com.example1.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example1.Model.User;
import com.example1.Repository.UserRepository;
import com.example1.Service.UserService;
import com.example1.Util.Converter;






@Service
public class  UserServiceImple implements UserService
{
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private Converter converter;
	
	
	public User login(String userName, String userPassword) {
	    User user = userRepository.findByUserNameAndPassword(userName, userPassword);
	    if (user == null) {
	        // Handle the case where the user is not found, for example, throw an exception.
	        throw new RuntimeException("User not found");
	    }
	    return user;
	}
	 



	@Override
	public List<User> getAllusers() {
		List<User> users=userRepository.findAll();
		return users;
	}
	
	@Override
	public  User addUser(User user)
	{
		userRepository.save(user);
		return user;
	}
	
}








