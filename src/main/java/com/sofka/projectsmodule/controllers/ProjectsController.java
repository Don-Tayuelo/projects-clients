package com.sofka.projectsmodule.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sofka.projectsmodule.models.ProjectModel;
import com.sofka.projectsmodule.persistencia.servicios.ProjectsRepository;

@CrossOrigin
@RestController
@RequestMapping("/projects")
public class ProjectsController {

	@Autowired
	private ProjectsRepository projectsRepository;
	
	@GetMapping
	public List<ProjectModel> getProjects(){
		return projectsRepository.getProjects();
	}
	 
	@GetMapping("/{nameProject}")
	public ProjectModel getProjectByName(@RequestParam String nameProject){
		return projectsRepository.findByName(nameProject);
	}
	
	@GetMapping("/names")
	public ProjectModel getProject(@RequestParam String nameProject){
		return projectsRepository.findByName(nameProject);
	}
	
	@PostMapping
	public void addProject(@Valid @RequestBody ProjectModel projectModel) {
		projectsRepository.addProject(projectModel);
	}
	
	/*
	@PostMapping("/projects/team")
	public void add
	*/
	
	@PutMapping("/edit/{_id}")
	public void putProject(@PathVariable(value = "_id") String _id, @Valid @RequestBody ProjectModel projectModel) {
		projectsRepository.putProject(_id, projectModel);
	}
	
	@DeleteMapping("/delete")
	public void deleteProject(@RequestParam String _id) {
		projectsRepository.deleteProject(_id);
	}
}













