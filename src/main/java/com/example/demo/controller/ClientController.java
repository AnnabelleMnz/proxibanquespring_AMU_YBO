package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Client;
import com.example.demo.service.ClientServiceImpl;

@RestController
@RequestMapping("/proxibanque/client")
public class ClientController {

	private final ClientServiceImpl clientServiceImpl;

	public ClientController(ClientServiceImpl conseillerServiceImpl) {
		this.clientServiceImpl = conseillerServiceImpl;
	}

	@GetMapping
	public List<Client> getAllClient() {
		return clientServiceImpl.getAllClients();
	}

	@GetMapping("/{id}")
	Optional<Client> getClientById(@PathVariable Long id) {
		return clientServiceImpl.getClientById(id);
	}

	@PostMapping
	Client postCoffee(@RequestBody Client client) {
		return clientServiceImpl.createClient(client);
	}

	@PutMapping("/{id}")
	ResponseEntity<Client> putClient(@PathVariable Long id, @RequestBody Client client) {

		return (clientServiceImpl.isClientIdExists(id))
				? new ResponseEntity<>(clientServiceImpl.createClient(client), HttpStatus.OK)
				: new ResponseEntity<>(clientServiceImpl.createClient(client), HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	void deleteClient(@PathVariable Long id) {
		clientServiceImpl.deleteClientById(id);
	}

}