package com.example1.Service;

import java.util.List;

import com.example1.Model.User;




public interface UserService
{
	 User login(String userName, String userPassword);
	 List<User> getAllusers();
		User addUser(User user);
}
