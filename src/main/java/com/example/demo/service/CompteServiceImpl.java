package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Compte;
import com.example.demo.persistance.CompteDao;

public class CompteServiceImpl implements CompteService {
	private CompteDao compteDao;
	
	@Override
	public List<Compte> getAllCompte() {
		return compteDao.findAll();
	}

	@Override
	public Optional<Compte> getCompteById(Long compteId) {
		if (compteId != null) {
			return compteDao.findById(compteId);
		} else {
			return Optional.empty();
		}
	}

	@Override
	public Compte createCompte(Compte compte) {
		return compteDao.save(compte);
	}

	@Override
	public Compte updateComptet(Long compteId, Compte compte) {
		return compteDao.save(compte);
	}

	@Override
	public void deleteCompte(Long compteId) {
		compteDao.deleteById(compteId);
	}
}
