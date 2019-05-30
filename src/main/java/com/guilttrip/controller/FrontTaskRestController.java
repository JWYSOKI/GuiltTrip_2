package com.guilttrip.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guilttrip.manager.TaskManager;
import com.guilttrip.viewmodel.TaskView;

@RestController
@RequestMapping("task")
public class FrontTaskRestController {

	@Autowired
	private TaskManager taskManager;
	
	@PostMapping()
	public TaskView createTask(@RequestBody TaskView task) {
		return taskManager.createTask(task);
	}
	
	@GetMapping("{id}")
	public TaskView getTaskById(@PathVariable int id) {
		return taskManager.getTaskById(id);
	}

	@GetMapping()
	public List<TaskView> getAllTasks() {
		return taskManager.getAllTasks();        
	}

	@PutMapping("{id}")
	public TaskView updateTask(@PathVariable("id") int id, @RequestBody TaskView task) {
		return taskManager.updateTask(task, id);
	}

	@DeleteMapping("{id}")
	public int deleteTaskById(@PathVariable int id) {
	 return	taskManager.deleteTaskById(id);
	}
}                             
