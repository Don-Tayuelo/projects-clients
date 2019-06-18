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
	
	public void putProject(String _id, ProjectModel projectModel) {
		projectsRepository.findById(_id).map(newProject -> {
			newProject.setProjectName(projectModel.getProjectName());
			newProject.setProjectDescription(projectModel.getProjectDescription());
			newProject.setProjectPrice(projectModel.getProjectPrice());
			newProject.setListTeams(projectModel.getListTeams());
			newProject.setIdClient(projectModel.getIdClient());
			newProject.setClientName(projectModel.getClientName());
			return projectsRepository.save(newProject);
		});
	}
}
