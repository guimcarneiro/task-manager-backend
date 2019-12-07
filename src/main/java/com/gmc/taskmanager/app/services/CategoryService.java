package com.gmc.taskmanager.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmc.taskmanager.app.entity.Category;
import com.gmc.taskmanager.app.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAll(){
		return this.categoryRepository.findAll();
	}
	
	public Category save(Category categoria) {
		return this.categoryRepository.save(categoria);
	}
	
}
