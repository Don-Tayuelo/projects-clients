package com.sofka.projectsmodule.persistencia.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sofka.projectsmodule.models.ClientModel;
import com.sofka.projectsmodule.persistencia.ClientModelRepository;
import com.sofka.projectsmodule.persistencia.servicios.ClientsService;

@Service
public class ClientsServiceImpl implements ClientsService {

	@Autowired
	private  ClientModelRepository clientRepository;


	public ClientsServiceImpl(ClientModelRepository repository) {
		this.clientRepository= repository;
	}

	@Override
	public  List<ClientModel> getClients() {
		return clientRepository.findAll();
	}

	@Override
	public ClientModel addClient(ClientModel cliente) {
		return clientRepository.save(cliente);
	}

	@Override
	public void deleteClient(String _id) {
		clientRepository.deleteById(_id);

	}

	@Override
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
}
