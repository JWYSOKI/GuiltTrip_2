package com.guilttrip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.guilttrip.viewmodel.UserView;

//jsp 
@Controller 
public class ProfileController {

	@PostMapping("/profile")
	public String showProfilePage(@ModelAttribute("user") UserView user) {
		return "profile";
	}

	@GetMapping("/profile")
	public String showLogin() {
	
		return "user/profile";
	}
}
