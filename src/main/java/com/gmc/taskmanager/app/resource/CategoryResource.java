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

import com.gmc.taskmanager.app.entity.Category;
import com.gmc.taskmanager.app.services.CategoryService;

@RestController
@RequestMapping("/categorias")
public class CategoryResource {

	@Autowired
	private CategoryService categoryService;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> categoriasSalvas = categoryService.findAll();
		
		if(categoriasSalvas.isEmpty())
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		
		return ResponseEntity.status(HttpStatus.OK).body(categoriasSalvas);
	}
	
	@PostMapping
	public ResponseEntity<Category> save(@RequestBody Category categoria){
		Category categoriaSalva = categoryService.save(categoria);
		return ResponseEntity.status(HttpStatus.CREATED).body(categoriaSalva);
	}
}
