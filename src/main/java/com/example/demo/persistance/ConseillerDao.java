package com.example.demo.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Conseiller;

public interface ConseillerDao extends JpaRepository<Conseiller, Long> {
	
//	List<Conseiller> findByNom(String nom);
//
//	List<Conseiller> findByPrenom(String prenom);
//
//	List<Conseiller> findByClientsSizeLessThanEqual(int maxClients);
//
//	Conseiller findByNomAndPrenom(String nom, String prenom);
//
//	List<Conseiller> findByResponsabilité(String responsabilité);
}
