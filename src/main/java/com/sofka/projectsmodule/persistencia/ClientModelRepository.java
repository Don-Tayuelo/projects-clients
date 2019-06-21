package com.sofka.projectsmodule.persistencia;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sofka.projectsmodule.models.ClientModel;

<<<<<<< HEAD

=======
@Repository
>>>>>>> 6a4c3091f52eb31cf90427558a0169a9b059b9e3
public interface ClientModelRepository extends MongoRepository<ClientModel, Serializable> {
		
	public List<ClientModel> findByClientName(String clientName);
	
}
