package com.sofka.projectsmodule.persistencia.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sofka.projectsmodule.models.ClientModel;
import com.sofka.projectsmodule.persistencia.ClientModelRepository;
import com.sofka.projectsmodule.persistencia.servicios.ClientsService;

@Service
public class ClientsRepositoryImpl implements ClientsService {
<<<<<<< HEAD
	
	@Autowired
	private  ClientModelRepository clientRepository;
	
	
	public ClientsRepositoryImpl(ClientModelRepository repository) {
		this.clientRepository= repository;
	}
=======

	@Autowired  
	private ClientModelRepository clientRepository;
>>>>>>> master

	@Override
	public  List<ClientModel> getClients() {
		return clientRepository.findAll();
	}
	
	@Override
<<<<<<< HEAD
	public ClientModel addClient(ClientModel cliente) {
		return clientRepository.save(cliente);	
=======
	public void addClient(ClientModel cliente) {
		clientRepository.save(cliente);
>>>>>>> master
	}

	@Override
	public void deleteClient(String _id) {
		clientRepository.deleteById(_id);

	}

	@Override
<<<<<<< HEAD
	public void deleteClients() {
	   clientRepository.deleteAll();
		}

	
	@Override
	public List<ClientModel> findByClientName(String clientName) {
	    return clientRepository.findByClientName(clientName);
	}


	@Override
	public Optional<ClientModel> findById(String idClient) {
		return clientRepository.findById(idClient);
	}


=======
	public void deleteClients(ClientModel cliente) {
		clientRepository.deleteAll();
	}
	
	@Override
    public Optional<ClientModel> findById(String idClient) {
        return clientRepository.findById(idClient);
    }

	@Override
	public List<ClientModel> findByClientName(String clientName) {
		return clientRepository.findByClientName(clientName);
	}
>>>>>>> master
}
