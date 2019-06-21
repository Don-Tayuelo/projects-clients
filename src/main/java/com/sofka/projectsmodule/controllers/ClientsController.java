package com.sofka.projectsmodule.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sofka.projectsmodule.models.ClientModel;
import com.sofka.projectsmodule.persistencia.servicios.ClientsService;

@CrossOrigin
@RestController
@RequestMapping("/clients")
public class ClientsController {
	
	@Autowired(required = true)
	private ClientsService clientRepository;
	
	
	@GetMapping
	public List<ClientModel> getClients(){ 
		return clientRepository.getClients();
	}
	
	@GetMapping("/find/{idClient}")
    public Optional<ClientModel> findById(@PathVariable("idClient") String idClient){
        return clientRepository.findById(idClient);
    }
	
	@GetMapping("/search")
    public List<ClientModel> findByName(@RequestParam("name") String clientName){    
        return clientRepository.findByClientName(clientName);
    }
		
	@PostMapping
	public String addClient(@RequestBody ClientModel clientModel) { 
		clientRepository.addClient(clientModel);
		return "Cliente Guardado";
	}
	
	@PutMapping
	public String UpdateClient(@RequestBody ClientModel clientModel) { 
		clientRepository.addClient(clientModel);
		return "Cliente Actualizado";
		
	}
	
	@DeleteMapping("/delete/{id}")                                     
	public String  deleteClientId(@PathVariable("id") String _id) {
		clientRepository.deleteClient(_id);
		return "Cliente eliminado";
		
	}
	
	@DeleteMapping("/delete")                                         
	public String  deleteClients(ClientModel client) {
		clientRepository.deleteClients(client);
		return "Clientes Eliminados";
	}
}
