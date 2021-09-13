package com.example.promotion.controller;


import com.example.promotion.model.Cliente;
import com.example.promotion.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClienteController {
    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }

    @PostMapping
    public Cliente newCliente(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }
    @GetMapping
    public List<Cliente> all(){
        return clienteService.all();
    }
    @GetMapping("/{date}")
    public List<Cliente> cumpleanero(@PathVariable String date){return clienteService.clientsBirthdate(date);}

}
