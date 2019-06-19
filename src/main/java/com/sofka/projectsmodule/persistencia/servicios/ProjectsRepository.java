package com.sofka.projectsmodule.persistencia.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.sofka.projectsmodule.models.ProjectModel;

@Service
public interface ProjectsRepository {

	public ResponseEntity<Object> addProject(ProjectModel projectModel);
	
	public ProjectModel findByName(String nameProject);
	
	public List<ProjectModel> getProjects();
	
	public Optional<ProjectModel> getProject(String _id);
	
	public ResponseEntity<Object> putProject(String _id, ProjectModel projectModel);
	
	public void deleteProject(String _id);
	
}
