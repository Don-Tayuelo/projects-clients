package com.sofka.projectsmodule.persistencia;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sofka.projectsmodule.models.ClientModel;

@Repository
public interface ClientModelRepository extends MongoRepository<ClientModel, Serializable> {
		
	
}
