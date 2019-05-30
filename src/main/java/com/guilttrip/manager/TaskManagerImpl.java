package com.guilttrip.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.guilttrip.viewmodel.TaskView;

@Service
public class TaskManagerImpl implements TaskManager {

	@Autowired
	private RestTemplate restTemplate;

	private final String URL = "http://localhost:8081/GuiltTrip_backend/task/";

	@Override
	public TaskView createTask(TaskView task) {
		HttpEntity<TaskView> requestEntity = new HttpEntity<>(task);
		ResponseEntity<TaskView> response = restTemplate.exchange(URL, HttpMethod.POST, requestEntity, TaskView.class);
		return response.getBody();                          
	}

	@Override
	public TaskView getTaskById(int id) {
		ResponseEntity<TaskView> response = restTemplate.exchange(URL + id, HttpMethod.GET, null, TaskView.class);
		return response.getBody();
	}

	@Override
	public List<TaskView> getAllTasks() {
		ResponseEntity <List<TaskView>> response = restTemplate.exchange(URL, HttpMethod.GET, null, 
				new ParameterizedTypeReference<List<TaskView>>() {
				});
		return response.getBody();
	}

	@Override
	public TaskView updateTask(TaskView task, int id) {
		HttpEntity<TaskView> requestEntity = new HttpEntity<>(task);
		ResponseEntity<TaskView> response = restTemplate.exchange(URL + id, HttpMethod.PUT, requestEntity, TaskView.class);
		return response.getBody();
	}

	@Override
	public int deleteTaskById(int id) {
		ResponseEntity<Integer> response = restTemplate.exchange(URL + id, HttpMethod.DELETE, null, Integer.class);
		return response.getBody();
	}
}
