package com.sofka.projectsmodule.persistencia;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sofka.projectsmodule.models.ClientModel;


public interface ClientModelRepository extends MongoRepository<ClientModel, Serializable> {
		
	public List<ClientModel> findByClientName(String clientName);
	
}
