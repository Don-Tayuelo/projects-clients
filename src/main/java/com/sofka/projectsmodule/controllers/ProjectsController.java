package com.sofka.projectsmodule.controllers;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
import com.sofka.projectsmodule.persistencia.servicios.ProjectsService;

@CrossOrigin
@RestController
@RequestMapping("/projects")
public class ProjectsController {

<<<<<<< HEAD
	@Autowired
	private ProjectsService projectsRepository;
	
=======
	@Autowired(required = true)
	private ProjectsRepository projectsRepository;

>>>>>>> 6a4c3091f52eb31cf90427558a0169a9b059b9e3
	@GetMapping
	public List<ProjectModel> getProjects() {
		return projectsRepository.getProjects();
	}

	@GetMapping("/byName")
	public ProjectModel getProjectByName(@RequestParam String nameProject) {
		return projectsRepository.findByName(nameProject);

	}

	@GetMapping("/names")
	public ProjectModel getProject(@RequestParam String nameProject) {
		return projectsRepository.findByName(nameProject);
	}

	@PostMapping
	public ResponseEntity<Object> addProject(@Valid @RequestBody ProjectModel projectModel) {
		return projectsRepository.addProject(projectModel);
	}

	/*
	 * @PostMapping("/projects/team") public void add
	 */

	@PutMapping("/edit/{_id}")
	public ResponseEntity<Object> putProject(@PathVariable(value = "_id") String _id, @Valid @RequestBody ProjectModel projectModel) {
		return projectsRepository.putProject(_id, projectModel);
	}

	@DeleteMapping("/delete")
	public void deleteProject(@RequestParam String _id) {
		projectsRepository.deleteProject(_id);
	}
}
