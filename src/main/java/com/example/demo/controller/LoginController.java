package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Users;
import com.example.demo.service.UserService;

@Controller
@RequestMapping("/user")
public class LoginController {

	@Autowired
	UserService userService;
	

	@GetMapping("/register")
	public ModelAndView showRegistrationView() {

		
		ModelAndView model = new ModelAndView("register.html");
		return model;
	}

	@PostMapping("/registerUser")
	public ModelAndView registerDetails(@Valid @ModelAttribute("user") Users user,Errors error) {
		ModelAndView model = new ModelAndView("home.html");
		userService.registerUser(user);
		model.addObject("name", user.getEmail());

		return model;
	}

	@GetMapping(value = "/login")
	public ModelAndView showLogin() {
		ModelAndView model = new ModelAndView("login.html");
		return model;
	}


	@PostMapping(value = "/loginUser")
	public ModelAndView loginProcess(HttpServletRequest request,@RequestParam("userName") String userName,
			@RequestParam("password") String password) {
		ModelAndView model = new ModelAndView("home.html");
		/*String user=request.getUserPrincipal().getName();
		System.out.println("===============================================================>>>>"+user);*/
		model.addObject("user",userName);
		userService.loadUserByUserName(userName, password);
		return model;
	}

}
