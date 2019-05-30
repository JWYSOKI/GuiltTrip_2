package com.guilttrip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.guilttrip.viewmodel.UserView;

@Controller
public class LoginController {

	@PostMapping("/login")
	public String loginUser(@ModelAttribute("user") UserView user) {
		return "redirect:/task/hello";
	}

	@GetMapping("/login")
	public String showLogin() {
		System.out.println("clicked login");
		return "user/login";
	}
}
