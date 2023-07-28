package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.Conseiller;

public interface ConseillerService {
	Optional<Conseiller> getConseillerById(Long conseillerId);
}
