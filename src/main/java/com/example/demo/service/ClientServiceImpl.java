package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Client;
import com.example.demo.persistance.ClientDao;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDao clientDao;

	@Autowired
	public ClientServiceImpl(ClientDao clientDao) {
		this.clientDao = clientDao;
	}

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
	public void deleteClientById(Long clientId) {
		clientDao.deleteById(clientId);
	}

	@Override
	public boolean isClientIdExists(Long id) {
		return clientDao.existsById(id);
	}

}
