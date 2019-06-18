package com.sofka.projectsmodule.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sofka.projectsmodule.models.ProjectModel;
import com.sofka.projectsmodule.repository.ProjectsRepository;

@CrossOrigin
@RestController
@RequestMapping("/projects")
public class ProjectsController {

	@Autowired
	private ProjectsRepository projectsRepository;
	
	@GetMapping
	public List<ProjectModel> getProjects(){
		return projectsRepository.findAll();
	}
	 
	@GetMapping
	public ProjectModel getProject(@RequestParam String nameProject){
		return projectsRepository.findByName(nameProject);
	}
	
	@PostMapping
	public void addProject(@Valid @RequestBody ProjectModel projectModel) {
		projectsRepository.save(projectModel);
	}
}













