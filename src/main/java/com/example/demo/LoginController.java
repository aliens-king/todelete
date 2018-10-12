package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;





@Controller
@RequestMapping("/client")
public class LoginController {


    /*@RequestMapping(value= "/login", method = RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("../template/login");
        return modelAndView;
    }*/


   /* @RequestMapping(value= "/register", method = RequestMethod.GET)
    public ModelAndView register(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("../template/register");
        return modelAndView;
    }*/
	
	@GetMapping("/home")
public String register() {
	return"../template/register.html";
}
	
	
	
	
	/*for saveing user*/
	/*@PostMapping("/save")
	public ResponseDTO createBookDetails(@RequestBody UserDTO userDTO) {
		return userService.saveUser(userDTO);
	}*/
	
	
	/*@Override
	public ResponseDTO saveUser(UserDTO userDTO) {
		ResponseDTO responseDTO = null;
		if (userDTO != null) {
			try {
				User user = getUserObj(userDTO);
				user = userRepository.save(user);
				userDTO = getUserDTOObj(user);
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		return responseDTO;
	}
	private UserDTO getUserDTOObj(User user) {
		UserDTO userDTO = null;
		if (null != user) {
			userDTO = new UserDTO();
			userDTO.setUserName(user.getUserName());
			userDTO.setFullName(user.getFullName());
			userDTO.setEmail(user.getEmail());;
			userDTO.setPassword(user.getPassword());
			userDTO.setDeleted(user.getDeleted());
			userDTO.setUserStatusId(user.getUserStatusId());
			

		}
		return userDTO;

	}
private User getUserObj(UserDTO userDTO) {
		
		User  user=null;
		
		if(null !=userDTO) {
			user=new User();
			if(null !=userDTO.getId())
				user.setId(userDTO.getId());
			user.setCreatedAt(DateUtils.getDateObj(userDTO.getCreatedAt(), IConstants.DATE_FORMAT));
			user.setDeleted(userDTO.getDeleted());
			//user.setDeletedAt(DateUtils.getDateObj(userDTO.getDeletedAt(), IConstants.DATE_FORMAT));
			user.setEmail(userDTO.getEmail());
			user.setPassword(userDTO.getPassword());
			user.setFullName(userDTO.getFullName());
			//user.setUpdatedAt(DateUtils.getDateObj(userDTO.getUpdatedAt(), IConstants.DATE_FORMAT));
			user.setUserName(userDTO.getUserName());
			user.setUserStatusId(userDTO.getUserStatusId());
		}
		return user;
	}
*/
	
}
