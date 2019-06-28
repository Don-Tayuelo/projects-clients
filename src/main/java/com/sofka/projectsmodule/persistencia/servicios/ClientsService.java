package com.sofka.projectsmodule.persistencia.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
<<<<<<< HEAD

import com.sofka.projectsmodule.models.ClientModel;


 
@Service
public interface ClientsService {
	
	
	public List<ClientModel> getClients(); 
	
	public ClientModel addClient(ClientModel cliente); 
	
	public List<ClientModel> findByClientName(String clientName);
	
	public  void deleteClient(String _id); 
	
	public void deleteClients();
	
	public Optional<ClientModel> findById(String idClient);
	
	
	
=======
import com.sofka.projectsmodule.models.ClientModel;

@Service
public interface ClientsService {

	public void addClient(ClientModel cliente);

	public List<ClientModel> getClients();

	public void deleteClient(String _id);

	public void deleteClients(ClientModel cliente);
	
	public Optional<ClientModel> findById(String idClient);
	
	public List<ClientModel> findByClientName(String clientName);
>>>>>>> master
}