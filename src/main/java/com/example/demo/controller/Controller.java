package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Client;
import com.example.demo.service.ClientServiceImpl;

@RestController
@RequestMapping("/proxibanque")
public class Controller {

    private  final ClientServiceImpl conseillerServiceImpl;

    public Controller(ClientServiceImpl conseillerServiceImpl) {
        this.conseillerServiceImpl = conseillerServiceImpl;
    }

    @GetMapping
    public List<Client> getAllClient() {
        return conseillerServiceImpl.getAllClients();
    }
}
