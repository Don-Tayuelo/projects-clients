package com.sofka.projectsmodule.persistencia.servicios;

import java.util.List;
import org.springframework.stereotype.Service;
import com.sofka.projectsmodule.models.ClientModel;

@Service
public interface ClientsService {

	public void addClient(ClientModel cliente);

	public List<ClientModel> getClients();

	public void deleteClient(String _id);

	public void deleteClients(ClientModel cliente);
}