package com.github.marcelo.service;

import com.github.marcelo.model.Cliente;
import com.github.marcelo.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository repository;

    public void salvarCliente(Cliente cliente) {
        validarCLiente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCLiente(Cliente cliente) {
        // aplica validacoes
    }

}
