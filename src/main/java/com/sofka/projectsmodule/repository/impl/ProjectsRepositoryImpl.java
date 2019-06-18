package com.sofka.projectsmodule.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.sofka.projectsmodule.models.ProjectModel;
import com.sofka.projectsmodule.repository.ProjectsRepository;

public class ProjectsRepositoryImpl {
	
	@Autowired
	private ProjectsRepository projectsRepository;
	
	public ProjectModel findByName(String nameProject) {
		
		return projectsRepository.findByName(nameProject);
	}
}
