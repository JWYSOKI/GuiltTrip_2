package com.guilttrip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//jsp
@Controller
public class IndexController {

	@GetMapping("/")
	public String showHomePage() {
		return "index";
	}

}
