package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Compte {
	@Id
	@GeneratedValue
	private Long id;
	private int numCompte;
	private int solde;
	private String dateOuverture;
	
	@ManyToOne
	private Client client;

	@OneToMany(mappedBy = "compte")
	private List<Carte> cartes;
	
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
}
