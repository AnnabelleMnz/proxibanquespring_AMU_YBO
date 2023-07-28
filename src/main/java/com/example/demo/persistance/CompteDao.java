package com.example.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Compte;

public interface CompteDao extends JpaRepository<Compte, Long>  {

}
