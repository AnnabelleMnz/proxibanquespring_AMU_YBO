package com.example.demo.persistance;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.model.Client;
import com.example.demo.model.Conseiller;

import jakarta.annotation.PostConstruct;

@Component
public class DBInit {

    private final ClientDao clientDao;
    
    private final ConseillerDao conseillerDao;

    public DBInit(ClientDao clientDao,ConseillerDao conseillerDao) {
            this.clientDao = clientDao;
            this.conseillerDao = conseillerDao;
        }

    @SuppressWarnings("deprecation")
	@PostConstruct
    public void initDB() {
        // Create a new Conseiller
        Conseiller conseiller = new Conseiller();
        conseiller.setNom("Smith");
        conseiller.setPrenom("John");

        // Save the Conseiller to the database
        conseillerDao.save(conseiller);

        // Create clients and associate them with the Conseiller
        Client client1 = new Client("Dupont", "Alice", "12 rue des Fleurs", "75001");
        client1.setConseiller(conseiller);

        Client client2 = new Client("Martin", "Bob", "24 avenue de la Liberté", "69002");
        client2.setConseiller(conseiller);

        // Save the clients to the database
        clientDao.saveAll(List.of(client1, client2));
        clientDao.getById((long) 1);
    }
    
}
