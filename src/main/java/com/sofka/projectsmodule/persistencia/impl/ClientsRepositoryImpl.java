package com.sofka.projectsmodule.persistencia.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sofka.projectsmodule.models.ClientModel;
import com.sofka.projectsmodule.persistencia.ClientModelRepository;
import com.sofka.projectsmodule.persistencia.servicios.ClientsRepository;

@Service
public class ClientsRepositoryImpl implements ClientsRepository {
	
	@Autowired
	private ClientModelRepository clientModelRepository;
	
	public void addClient(ClientModel client) {
		clientModelRepository.save(client);
	}
}
