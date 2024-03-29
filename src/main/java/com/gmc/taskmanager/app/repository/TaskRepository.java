package com.gmc.taskmanager.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gmc.taskmanager.app.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
