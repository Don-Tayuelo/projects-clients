package com.sofka.projectsmodule.controllers;

import java.util.List;
import java.util.Optional;


import javax.validation.ValidationException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
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
	
	@Autowired
	private ClientsService clientRepository;
	
	
	@GetMapping
	public List<ClientModel> getClients(){ 
		return clientRepository.getClients();
	}
	
	
	@GetMapping("/search/{idClient}") 
	public Optional<ClientModel> findById(@PathVariable("idClient") String idClient){ 
		return clientRepository.findById(idClient);
	}
	
	
	@GetMapping("/search")
	public List<ClientModel> findByName(@RequestParam("name") String clientName  ){	
		return clientRepository.findByClientName(clientName);
	}
	

	
	@PostMapping
	public ClientModel addClient(@RequestBody ClientModel clientModel) { 
		if (clientModel.getClientName() != null && clientModel.getProductOwner() != null && clientModel.getListProjects() != null) 	
		return clientRepository.addClient(clientModel);
		else throw new ValidationException("no se pudo crear");
	}
	
	@ExceptionHandler(ValidationException.class)
		ResponseEntity<String> exceptionHandler(ValidationException e){
		return	new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	
	@PutMapping
	ResponseEntity<ClientModel> updateClients(@RequestBody ClientModel clientModel) { 
		if(clientRepository.findById(clientModel.getIdClient()).isPresent())
		    return  new ResponseEntity<ClientModel>(clientRepository.addClient(clientModel), HttpStatus.OK );	
		else 
			return  new ResponseEntity<ClientModel>(clientModel, HttpStatus.BAD_REQUEST );	
	}
	
	
	@DeleteMapping("/delete/{id}")                                     
	public String  deleteClientById(@PathVariable("id") String _id) {
		clientRepository.deleteClient(_id);
		return "Cliente eliminado";
		
	}
	
	@DeleteMapping("/delete")                                         
	public String  deleteAllClients() {
		clientRepository.deleteClients();
		return "Clientes Eliminados";
	}
	
}
	
	

