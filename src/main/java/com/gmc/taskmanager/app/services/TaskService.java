package com.gmc.taskmanager.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmc.taskmanager.app.entity.Task;
import com.gmc.taskmanager.app.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;

	public List<Task> findAll(){
		return taskRepository.findAll();
	}
	
	public Task save(Task task) {
		return taskRepository.save(task);
	}
	
}
