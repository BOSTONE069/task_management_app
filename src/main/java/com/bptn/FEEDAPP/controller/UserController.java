package com.bptn.FEEDAPP.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.bptn.FEEDAPP.service.UserService;

public class UserController {
	
	final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	UserServices userService;
	
	@GetMapping("/")
	public List<UserBean> listUsers() {
		logger.debug("The listUsers() method was invoked!");
		return this.userService.listUsers();
	}

}
