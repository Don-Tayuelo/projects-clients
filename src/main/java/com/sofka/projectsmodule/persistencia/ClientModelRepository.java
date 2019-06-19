package com.sofka.projectsmodule.persistencia;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sofka.projectsmodule.models.ClientModel;

public interface ClientModelRepository extends MongoRepository<ClientModel, Serializable> {
		
	
}
