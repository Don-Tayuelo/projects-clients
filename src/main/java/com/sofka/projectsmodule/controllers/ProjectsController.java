package com.sofka.projectsmodule.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sofka.projectsmodule.models.CustomProjectsForBilling;
import com.sofka.projectsmodule.models.ProjectModel;
import com.sofka.projectsmodule.persistencia.servicios.ProjectsService;

@CrossOrigin
@RestController
@RequestMapping("/projects")
public class ProjectsController {

	@Autowired(required = true)
	private ProjectsService projectsRepository;

	@GetMapping
	public List<ProjectModel> getAllProjects() {
		return projectsRepository.getAllProjects();
	}

	@GetMapping("/billing")
	public List<CustomProjectsForBilling> getProjectsForBilling() {
		return projectsRepository.getProjectsForBilling();
	}

	@GetMapping("/{_id}")
	public Optional<ProjectModel> getSingleProjectById(@PathVariable(value = "_id") String _id) {
		return projectsRepository.getSingleProjectById(_id);
	}

	@PostMapping
	public ResponseEntity<Object> addProject(@Valid @RequestBody ProjectModel projectModel) {
		return projectsRepository.addProject(projectModel);
	}

	@PutMapping("/edit/{_id}")
	public ResponseEntity<Object> putProject(@PathVariable(value = "_id") String _id,
			@Valid @RequestBody ProjectModel projectModel) {
		return projectsRepository.putProject(_id, projectModel);
	}

	@DeleteMapping("/delete")
	public ResponseEntity<Object> deleteAllProjects() {
		return projectsRepository.deleteAllProjects();
	}

	@DeleteMapping("/deletesingle")
	public ResponseEntity<Object> deleteProject(@RequestParam String _id) {
		return projectsRepository.deleteSingleProject(_id);
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException exception) {
		Map<String, String> errors = new HashMap<>();
		
		exception.getBindingResult().getAllErrors().forEach((error) -> {
			
			String fieldName = ((FieldError) error).getField();
			String errorMessage = error.getDefaultMessage();
			errors.put(fieldName, errorMessage);
		});
		return errors;
	}
}
