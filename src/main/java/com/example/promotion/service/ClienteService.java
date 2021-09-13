package com.example.promotion.service;

import ch.qos.logback.core.net.server.Client;
import com.example.promotion.model.Cliente;
import com.example.promotion.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> all() {
        return clienteRepository.findAll();
    }

    public List<Cliente> clientsBirthdate(String date) {
        return clienteRepository.clientsWithBirthDay(date);
    }
}
