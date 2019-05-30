package com.guilttrip.manager;

import java.util.List;

import com.guilttrip.viewmodel.TaskView;

public interface TaskManager {
	

	TaskView createTask(TaskView task);
	
	TaskView getTaskById(int id);
	
	List<TaskView> getAllTasks();
	
	TaskView updateTask(TaskView task, int id);

	int deleteTaskById(int id);
	
}
