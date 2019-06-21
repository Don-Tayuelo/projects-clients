package com.sofka.projectsmodule.persistencia.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sofka.projectsmodule.models.ProjectModel;

@Service
public interface ProjectsService {

	public void addProject(ProjectModel projectModel);
	
	public ProjectModel findByName(String nameProject);
	
	public List<ProjectModel> getProjects();
	
	public Optional<ProjectModel> getProject(String _id);
	
	public void putProject(String _id, ProjectModel projectModel);
	
	public void deleteProject(String _id);
	
}
