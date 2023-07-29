package com.example.demo.persistance;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.model.Carte;
import com.example.demo.model.Client;
import com.example.demo.model.Compte;
import com.example.demo.model.Conseiller;

import jakarta.annotation.PostConstruct;

@Component
public class DBInit {

	private final ClientDao clientDao;

	private final ConseillerDao conseillerDao;

	private final CompteDao compteDao;

	public DBInit(ClientDao clientDao, ConseillerDao conseillerDao, CompteDao compteDao) {
		this.clientDao = clientDao;
		this.conseillerDao = conseillerDao;
		this.compteDao = compteDao;
	}

	@SuppressWarnings("unchecked")
	@PostConstruct
	public void initDB() {

		/// Création des clients
		Client c1 = new Client("Dupont", "Alice", "12 rue des Fleurs", "75001");
		Client c2 = new Client("Martin", "Bob", "24 avenue de la Liberté", "69002");
		Client c3 = new Client("Mimosa", "Agathe", "8 rue de sault", "38000");

		/// Création des conseillers
		Conseiller conseiller1 = new Conseiller("John");
		Conseiller conseiller2 = new Conseiller("Maria");
		/// Création des comptes
		Compte compte1 = new Compte(12555587, 50000, "27/07/2023");
		Compte compte2 = new Compte(88854141, 2500, "27/05/2023");

		c1.setConseiller(conseiller1);
		c2.setConseiller(conseiller1);
		c3.setConseiller(conseiller2);

		conseiller1.setClients(c1);
		conseiller1.setClients(c2);
		conseiller2.setClients(c3);

		c1.addCompte(compte1);
		c2.addCompte(compte2);

		clientDao.saveAll(List.of(c1, c2,c3));

		conseillerDao.saveAll(List.of(conseiller1,conseiller2));
		
		compteDao.saveAll(List.of(compte1,compte2));
	}

}
