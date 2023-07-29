package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Conseiller {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nom;
	private String prenom;

	@OneToMany(mappedBy = "conseiller", cascade = { CascadeType.PERSIST })
	private List<Client> clients;

	public Conseiller() {
		clients = new ArrayList<>();
	}

	public Conseiller(String nom) {
		this.nom = nom;
		clients = new ArrayList<>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(Client client) {
		clients.add(client);
	}

	public void addClient(Client client) {
		clients.add(client);
		client.setConseiller(this);
	}

	public void removeClient(Client client) {
		clients.remove(client);
		client.setConseiller(null);
	}

}