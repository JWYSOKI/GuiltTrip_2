package com.guilttrip.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.guilttrip.viewmodel.UserView;

@Service
public class UserManagerImpl implements UserManager {

	@Autowired
	private RestTemplate restTemplate;

	private final String URL = "http://localhost:8081/GuiltTrip_backend/user/";

	@Override
	public UserView createUser(UserView user) {
		HttpEntity<UserView> requestEntity = new HttpEntity<>(user);
		ResponseEntity<UserView> response = restTemplate.exchange(URL, HttpMethod.POST, requestEntity, UserView.class);
		return response.getBody();
	}
	
	@Override
	public UserView getUserById(int id) {
		ResponseEntity<UserView> response = restTemplate.exchange(URL + id, HttpMethod.GET, null, UserView.class);
		return response.getBody();
	}
	
	@Override
	public List<UserView> getAllUsers() {
		ResponseEntity <List<UserView>> response = restTemplate.exchange(URL, HttpMethod.GET, null, 
				new ParameterizedTypeReference<List<UserView>>() {
				});
		return response.getBody();
	}

	@Override
	public UserView updateUser(UserView user) {
		ResponseEntity<UserView> response = restTemplate.exchange(URL, HttpMethod.PUT, null, UserView.class);
		return response.getBody();
	}

	@Override
	public int deleteUserById(int id) {
		ResponseEntity<Integer> response = restTemplate.exchange(URL + id, HttpMethod.DELETE, null, Integer.class);
		return response.getBody();
	}



}
