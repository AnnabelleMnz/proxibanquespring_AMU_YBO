package com.example.demo;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Conseiller;
import com.example.demo.service.ClientServiceImpl;
import com.example.demo.service.ConseillerServiceImpl;

@SpringBootApplication
public class ProxibanquespringYbAmApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxibanquespringYbAmApplication.class, args);

	}

}
