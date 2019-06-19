package com.sofka.projectsmodule.persistencia.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sofka.projectsmodule.models.ClientModel;
import com.sofka.projectsmodule.models.ProjectModel;


@Service
public interface ClientsRepository {
	
	public void addClient(ClientModel cliente); 
	
	public List<ClientModel> getClients(); // listar
	
	public  void deleteClient(String _id); //deleteForId
	
	public void deleteClients(ClientModel cliente);
	
	
}