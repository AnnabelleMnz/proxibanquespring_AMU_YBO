package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Carte {
	public enum TypeDeCarte {
        VISA_ELECTRON, VISA_PREMIER
    }
    private TypeDeCarte typeDeCarte;
    @Id
    @GeneratedValue
    private Long id;
    
    @ManyToOne
    private Compte compte;

    public Carte() {
        super();
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
}
