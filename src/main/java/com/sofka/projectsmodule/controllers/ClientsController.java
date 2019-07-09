package com.sofka.projectsmodule.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.sofka.projectsmodule.models.ClientModel;
import com.sofka.projectsmodule.persistencia.servicios.ClientsService;
import javax.validation.ValidationException;

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

	@GetMapping("/search/{idClient}")
	public Optional<ClientModel> findById(@PathVariable("idClient") String idClient){
		return clientRepository.findById(idClient);
	}



	@GetMapping("/search")
	public List<ClientModel> findByName(@RequestParam("name") String clientName){
		return clientRepository.findByClientName(clientName);
	}

	/*@PostMapping("/addClient")
	public ClientModel addClient(@RequestBody ClientModel clientModel) {
		if (clientModel.getIdClient() != null && clientModel.getProductOwner() != null && clientModel.getListProjects() != null)
			return clientRepository.addClient(clientModel);
		else throw new ValidationException("No se pudo crear");
	}*/

	@PostMapping("/addClient")
	public ClientModel guardar(@RequestBody ClientModel cliente) {
		return clientRepository.addClient(cliente);
	}

		@ExceptionHandler(ValidationException.class)
	ResponseEntity<String> exceptionHandler(ValidationException e){
		return    new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
	}


	/*@PutMapping
	ResponseEntity<ClientModel> updateClients(@RequestBody ClientModel clientModel) {
		if(clientRepository.findById(clientModel.getIdClient()).isPresent())
			return  new ResponseEntity<>(clientRepository.addClient(clientModel), HttpStatus.OK );
		else
			return  new ResponseEntity<>(clientModel, HttpStatus.BAD_REQUEST );
	}*/

	@PutMapping( path = "/{id}")
	public ClientModel editar(@PathVariable("id") String _id , @RequestBody ClientModel clientModel) {
		clientModel.setIdClient(_id);
		return clientRepository.edit(clientModel);
	}



	@DeleteMapping("/delete/{id}")
	public String  deleteClientById(@PathVariable("id") String id) {
		clientRepository.deleteClient(id);
		return "Cliente eliminado";

	}

	@DeleteMapping("/delete")
	public String  deleteAllClients() {
		clientRepository.deleteClients();
		return "Clientes Eliminados";
	}
}
