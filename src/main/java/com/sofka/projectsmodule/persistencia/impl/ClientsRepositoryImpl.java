package com.sofka.projectsmodule.persistencia.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sofka.projectsmodule.models.ClientModel;
import com.sofka.projectsmodule.persistencia.ClientModelRepository;
import com.sofka.projectsmodule.persistencia.servicios.ClientsService;

@Service
public class ClientsRepositoryImpl implements ClientsService {

	@Autowired  
	
	private ClientModelRepository clientRepository;

	@Override
	public List<ClientModel> getClients() {
		return clientRepository.findAll();
	}

	@Override
	public void addClient(ClientModel cliente) {
		clientRepository.save(cliente);
	}

	@Override
	public void deleteClient(String _id) {
		clientRepository.deleteById(_id);

	}

	@Override
	public void deleteClients(ClientModel cliente) {
		clientRepository.deleteAll();
	}
}
