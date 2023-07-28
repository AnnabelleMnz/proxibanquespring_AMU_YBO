package com.example.demo.persistance;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Client;
import com.example.demo.model.Conseiller;

public interface ClientDao extends JpaRepository<Client, Long>{

	void save(Conseiller conseiller);
	
	
//    List<Client> findByVille(String ville);
//
//    List<Client> findByCodePostal(String codePostal);
//
//    List<Client> findByConseillerId(Long conseillerId);
//
//    List<Client> findByConseillerNomAndConseillerPrenom(String nom, String prenom);
//
//    Optional<Client> findByNomAndPrenom(String nom, String prenom);
//
//    List<Client> findByAdresseAndCodePostal(String adresse, String codePostal);
}
