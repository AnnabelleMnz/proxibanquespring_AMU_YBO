package com.example.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Carte;

public interface CarteDao extends JpaRepository<Carte, Long>  {

}
