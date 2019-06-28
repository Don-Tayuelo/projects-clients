package com.sofka.projectsmodule.persistencia.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sofka.projectsmodule.exceptionsHandler.excepciones.ProjectNotFoundException;
import com.sofka.projectsmodule.models.ProjectModel;
import com.sofka.projectsmodule.persistencia.ProjectModelRepository;
import com.sofka.projectsmodule.persistencia.servicios.ProjectsService;

@Service

public class ProjectsRepositoryImpl implements ProjectsService{
	


	@Autowired
	private ProjectModelRepository projectsRepository;

	/*
	@Override
	public ResponseEntity<Object> addProject(ProjectModel projectModel) {
		projectsRepository.save(projectModel).
	}
	*/
	
	@Override
	public ProjectModel findByName(String nameProject) {
		return null;
	}

	@Override
	public List<ProjectModel> getProjects() {
		return projectsRepository.findAll();
	}

	@Override
	public Optional<ProjectModel> getProject(String _id) {
		return projectsRepository.findById(_id);
	}

	@Override
	public ResponseEntity<Object> putProject(String _id, ProjectModel projectModel) {

		if (!projectsRepository.existsById(_id)) throw new ProjectNotFoundException();
		{
			mapNewProject(_id, projectModel);
		}
		return new ResponseEntity<>("El proyecto con id \"" + _id + "\" fue actualizado.", HttpStatus.OK);
	}

	public void mapNewProject(String _id, ProjectModel projectModel) {
		projectsRepository.findById(_id).map(newProject -> {
			newProject.setProjectName(projectModel.getProjectName());
			newProject.setProjectDescription(projectModel.getProjectDescription());
			newProject.setProjectHours(projectModel.getProjectHours());
			newProject.setProjectPrice(projectModel.getProjectPrice());
			newProject.setListTeams(projectModel.getListTeams());
			newProject.setIdClient(projectModel.getIdClient());
			newProject.setClientName(projectModel.getClientName());
			return projectsRepository.save(newProject);
		});
	}

	@Override
	public void deleteProject(String _id) {
		projectsRepository.deleteById(_id);
	}

	@Override
	public ResponseEntity<Object> addProject(ProjectModel projectModel) {
		projectsRepository.save(projectModel);
		return null;
	}
}
