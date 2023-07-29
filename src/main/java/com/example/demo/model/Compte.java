package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Compte {
	@Id
	@GeneratedValue
	private Long id;
	private int numCompte;
	private int solde;
	private String dateOuverture;
	
	@JsonIgnore
	@ManyToOne(cascade = {CascadeType.PERSIST})
	@JoinColumn(name="client_id")
	private Client client;

	@OneToMany(mappedBy = "compte",cascade = {CascadeType.PERSIST})
	private List<Carte> cartes= new ArrayList<>();
	
	public Compte() {}
	
	public Compte(int numCompte, int solde, String dateOuverture) {
		this.numCompte = numCompte;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}
	
	public Long getId() {
		return id;
	}
	public int getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}
	public int getSolde() {
		return solde;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}
	public String getDateOuverture() {
		return dateOuverture;
	}
	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	public List<Carte> getCartes() {
		return cartes;
	}

	public void setCartes(List<Carte> cartes) {
		this.cartes = cartes;
	}
	
	public void addCarte(Carte carte) {
        cartes.add(carte);
        carte.setCompte(this);
    }
	
	public void removeCompte(Carte carte) {
        cartes.remove(carte);
        carte.setCompte(null);
    }
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
}
