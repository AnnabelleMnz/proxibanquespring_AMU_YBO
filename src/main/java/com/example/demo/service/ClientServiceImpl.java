package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Client;
import com.example.demo.persistance.ClientDao;

@Service
public class ClientServiceImpl implements ClientService {
	
	private ClientDao clientDao;

	@Override
	public List<Client> getAllClients() {
		return clientDao.findAll();
	}

	@Override
	public Optional<Client> getClientById(Long clientId) {
		if (clientId != null) {
			return clientDao.findById(clientId);
		} else {
			return Optional.empty();
		}
	}

	@Override
	public Client createClient(Client client) {
		return clientDao.save(client);
	}

	@Override
	public Client updateClient(Long clientId, Client client) {
		Long id = client.getId();
		return (clientDao.existsById(id)) ? (clientDao.save(client)) : (clientDao.save(client));
	}

	@Override
	public void deleteClient(Long clientId) {
		clientDao.deleteById(clientId);
	}







}
