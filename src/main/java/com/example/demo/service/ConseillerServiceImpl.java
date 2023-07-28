package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.Conseiller;
import com.example.demo.persistance.ConseillerDao;

public class ConseillerServiceImpl implements ConseillerService{
	
	private ConseillerDao conseillerDao;
	
	@Override
	public Optional<Conseiller> getConseillerById(Long conseillerId) {
		return conseillerDao.findById(conseillerId);
	}
}
