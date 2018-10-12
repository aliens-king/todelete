package com.example.demo.service;

import com.example.demo.model.Users;

public interface UserService {

	public Users registerUser(Users user);

	public Users loadUserByUserName(String userName, String password);

}
