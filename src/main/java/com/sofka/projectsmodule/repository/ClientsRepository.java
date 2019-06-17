package com.sofka.projectsmodule.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.sofka.projectsmodule.models.ClientModel;

public interface ClientsRepository extends MongoRepository<ClientModel, String>{

}