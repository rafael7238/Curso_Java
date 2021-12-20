package io.github.rafaelvasconceos.service;

import io.github.rafaelvasconceos.model.Cliente;
import io.github.rafaelvasconceos.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private ClienteRepository _repository;

    public ClienteService(ClienteRepository repository) {
        this._repository = repository;
    }

    public void salvarCliente(Cliente cliente) {
        ValidarCliente(cliente);
        this._repository.persistir(cliente);
    }

    public void ValidarCliente(Cliente cliente) {

    }
}