package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Compte;

public interface CompteService {
	List<Compte>  getAllCompte();

    Optional<Compte> getCompteById(Long compteId);

    Compte createCompte(Compte compte);

    Compte updateComptet(Long compteId, Compte compte);

    void deleteCompte(Long compteId);
}
