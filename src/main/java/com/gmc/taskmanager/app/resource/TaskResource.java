package com.gmc.taskmanager.app.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmc.taskmanager.app.entity.Task;
import com.gmc.taskmanager.app.services.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskResource {

	@Autowired
	private TaskService taskService;
	
	@GetMapping
	public ResponseEntity<List<Task>> findAll(){
		List<Task> tasks = taskService.findAll();
		if(tasks.isEmpty())
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		return ResponseEntity.status(HttpStatus.OK).body(tasks);
	}
	
	@PostMapping
	public ResponseEntity<Task> save(@RequestBody Task task){
		Task taskSalva = taskService.save(task);
		return ResponseEntity.status(HttpStatus.CREATED).body(taskSalva);
	}
	
}
