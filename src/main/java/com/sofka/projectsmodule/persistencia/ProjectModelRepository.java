package com.sofka.projectsmodule.persistencia;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sofka.projectsmodule.models.ProjectModel;

public interface ProjectModelRepository extends MongoRepository<ProjectModel, Serializable> {

}
