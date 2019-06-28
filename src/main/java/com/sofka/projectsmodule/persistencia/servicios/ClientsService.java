package com.sofka.projectsmodule.persistencia.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.sofka.projectsmodule.models.ClientModel;

@Service
public interface ClientsService {

	public List<ClientModel> getClients();

	public ClientModel addClient(ClientModel cliente);

	public List<ClientModel> findByClientName(String clientName);

	public  void deleteClient(String _id);

	public void deleteClients();

	public Optional<ClientModel> findById(String idClient);
}