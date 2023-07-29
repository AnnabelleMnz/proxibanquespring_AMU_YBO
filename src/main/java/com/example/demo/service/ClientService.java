package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Client;
import com.example.demo.model.Conseiller;

public interface ClientService {
	List<Client> getAllClients();

	Optional<Client> getClientById(Long clientId);

	Client createClient(Client client);

	Client updateClient(Long clientId, Client client);

	void deleteClientById(Long clientId);

	boolean isClientIdExists(Long id);
}
