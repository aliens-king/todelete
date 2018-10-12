package com.example.demo.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Users;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public Users registerUser(Users user) {

		return userRepository.save(user);
	}

	@Override
	@Transactional
	public Users loadUserByUserName(String userName, String password) {
		// TODO Auto-generated method stub
		return userRepository.loadUserByUserName(userName, password);
	}

}
