package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Conseiller;
import com.example.demo.persistance.ConseillerDao;

public class ConseillerServiceImpl implements ConseillerService {

	@Autowired
	private ConseillerDao conseillerDao;
	@Autowired
	public ConseillerServiceImpl(ConseillerDao conseillerDao) {
		this.conseillerDao = conseillerDao;
	}

	@Override
	public List<Conseiller> getAllConseillers() {
		// TODO Auto-generated method stub
		return conseillerDao.findAll();
	}

	@Override
	public Conseiller saveConseiller(Conseiller conseiller) {
		// TODO Auto-generated method stub
		return conseillerDao.save(conseiller);
	}

	@Override
	public Optional<Conseiller> getConseillerById(Long id) {
		// TODO Auto-generated method stub
		return conseillerDao.findById(id);
	}

	@Override
	public void deleteConseillerById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Conseiller updateConseiller(Conseiller conseiller) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isConseillerIdExists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
