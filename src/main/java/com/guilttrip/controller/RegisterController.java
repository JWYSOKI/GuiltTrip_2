package com.guilttrip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.guilttrip.viewmodel.UserView;

@Controller
public class RegisterController {

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showRegister() {
		System.out.println("clicked register");
		return "user/register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("user") UserView user) {

		return "redirect:/app/task/hello";
	}

}
