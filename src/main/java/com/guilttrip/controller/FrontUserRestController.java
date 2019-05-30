package com.guilttrip.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guilttrip.manager.UserManager;
import com.guilttrip.viewmodel.UserView;

@RestController
@RequestMapping("user")
public class FrontUserRestController {

	@Autowired
	private UserManager userManager;
	
	@PostMapping()
	public UserView createUser(@RequestBody UserView user) {
		return userManager.createUser(user);
	}
	
	@GetMapping("{id}")
	public UserView getUserById(@PathVariable int id) {
		return userManager.getUserById(id);
	}

	@GetMapping
	public List<UserView> getAllUsers() {
		return userManager.getAllUsers();
	}

	@PutMapping("{id}")
	public UserView updateUser(@PathVariable("id")int id, @RequestBody UserView user) {
		return userManager.updateUser(user);
	
	}

	@DeleteMapping("{id}")
	public int deleteUserById(@PathVariable int id) {
		return userManager.deleteUserById(id);
	}

}
