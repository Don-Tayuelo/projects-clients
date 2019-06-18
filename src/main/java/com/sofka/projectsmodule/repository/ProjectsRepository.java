package com.sofka.projectsmodule.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.sofka.projectsmodule.models.ProjectModel;

@Repository
public interface ProjectsRepository extends MongoRepository<ProjectModel, String>{

	public ProjectModel findByName(String nameProject);
	
}
