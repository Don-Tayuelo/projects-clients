package com.sofka.projectsmodule.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.sofka.projectsmodule.models.ProjectModel;

@Repository
public interface ProjectsRepository extends MongoRepository<ProjectModel, String>{

	public void addProject(ProjectModel projectModel);
	
	public ProjectModel findByName(String nameProject);
	
	public List<ProjectModel> getProjects();
	
	public ProjectModel getProject();
	
	public void putProject(String _id, ProjectModel projectModel);
	
	public void deleteProject(String _id);
	
}
