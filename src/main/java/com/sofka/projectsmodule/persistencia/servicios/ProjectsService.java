package com.sofka.projectsmodule.persistencia.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sofka.projectsmodule.models.CustomProjectsForBilling;
import com.sofka.projectsmodule.models.ProjectModel;

@Service
public interface ProjectsService {

	public ProjectModel addProject(ProjectModel projectModel);
	
	public List<ProjectModel> getAllProjects();
	
	public Optional<ProjectModel> getSingleProjectById(String _id);
	
	public boolean putProject(String _id, ProjectModel projectModel);
	
	public boolean deleteSingleProject(String _id);
	
	public ArrayList<CustomProjectsForBilling> getProjectsForBilling();

	public boolean deleteAllProjects();
}
