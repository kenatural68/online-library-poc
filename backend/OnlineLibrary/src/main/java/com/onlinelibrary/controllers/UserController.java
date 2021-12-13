package com.onlinelibrary.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.onlinelibrary.entities.User;
import com.onlinelibrary.repos.UserRepository;
import com.onlinelibrary.services.SecurityService;
import com.onlinelibrary.services.UserService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


//@RequestMapping("/users")
//@EnableSwagger2
@RestController
public class UserController {

	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private SecurityService securityService;
	
	
	@Autowired
	private BCryptPasswordEncoder encoder;//new line of code
	
	@PostMapping("/registerUser")
	@CrossOrigin(origins ="http://localhost:4200")
	public User registerUser(@RequestBody User user) throws Exception {
		
		String tempEmail = user.getEmail();
		
		if (tempEmail != null && !"".equals(tempEmail)) {
			User reguser = userService.getUserByEmail(tempEmail);
			if(reguser != null) {
				throw new Exception("email: " + tempEmail + "already exsists");
			}
		}
		
		User reguser = null;
		user.setPassword(encoder.encode(user.getPassword()));//new line of code
		reguser = userService.saveUser(user);
//		userService.saveUser(user);
		return reguser;
	}
	
	@PostMapping("/login")
	@CrossOrigin(origins ="http://localhost:4200")
	public User loginUser(@RequestBody User user) throws Exception {
//		String tempEmail = user.getEmail();
//		String tempPass = user.getPassword();
//		User loguser = null;
//		if(tempEmail !=null && tempPass !=null ) {
//			loguser = userService.getUserByEmailAndPassword(tempEmail,tempPass );
//		}
//		
//		if(loguser == null) {
//			throw new Exception("user does not exist!!");
//		}
//		return loguser;
		
		
		String tempEmail = user.getEmail();
		String tempPass = user.getPassword();
		User loguser = null;
		
		boolean loginResponse = securityService.login(tempEmail,  tempPass);
		if(loginResponse) {
			loguser = userService.getUserByEmailAndPassword(tempEmail,  tempPass);
		}else {
			throw new Exception("user does not exist!!");
			
		}
		return loguser;
	}
	

	
}
