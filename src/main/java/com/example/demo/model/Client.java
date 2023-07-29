package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String adresse;
	private String cp;
	private String ville;
	private int telephone;
	@JsonIgnore
	@ManyToOne(cascade = { CascadeType.PERSIST })
	@JoinColumn(name = "conseiller_id")
    private Conseiller conseiller;
	
	@OneToMany(mappedBy = "client", cascade = { CascadeType.PERSIST })
	private List<Compte>comptes;
	
	
	public Client() {}
	
	public Client(String nom, String prenom, String adresse, String cp) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.cp = cp;
		this.comptes = new ArrayList<>(); // Initialize the cartes list here
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public List<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}
	public Conseiller getConseiller() {
		return conseiller;
	}
	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}
	public void addCompte(Compte compte) {
		comptes.add(compte);
		compte.setClient(this);
	}
	
	public void removeCompte(Compte compte) {
        comptes.remove(compte);
        compte.setClient(null);
    }
	
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", cp=" + cp
				+ ", ville=" + ville + ", telephone=" + telephone + "]";
	}
}
