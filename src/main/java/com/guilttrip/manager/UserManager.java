package com.guilttrip.manager;

import java.util.List;

import com.guilttrip.viewmodel.UserView;


public interface UserManager {

	UserView createUser(UserView user);
	
	UserView getUserById(int id);
	
	List<UserView> getAllUsers();
	
	UserView updateUser(UserView user);

	int deleteUserById(int id);
	
}
