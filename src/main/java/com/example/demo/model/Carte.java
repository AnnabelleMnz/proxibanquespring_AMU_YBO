package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Carte {
	public enum TypeDeCarte {
        VISA_ELECTRON, VISA_PREMIER
    }
    private TypeDeCarte typeDeCarte;
    @Id
    @GeneratedValue
    private Long id;
    @JsonIgnore
    @ManyToOne(cascade = { CascadeType.PERSIST })
	@JoinColumn(name = "compte_id")
    private Compte compte;

    public Carte() {
    }

    public Carte(Long id,TypeDeCarte typeDeCarte ) {
        super();
        this.id = id;
        this.typeDeCarte = typeDeCarte;
    }

    public Long getId() {
        return id;
    }


    public TypeDeCarte  getTypeDeCarte() {
        return typeDeCarte;
    }

    public void setTypeDeCarte(TypeDeCarte  typeDeCarte) {
        this.typeDeCarte = typeDeCarte;
    }
    
    public Compte getCompte() {
    	return compte;
    }

	public void setCompte(Compte compte) {
		this.compte = compte;
	}
}
