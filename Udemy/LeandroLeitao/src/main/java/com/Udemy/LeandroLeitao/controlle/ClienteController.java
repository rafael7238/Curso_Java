package com.Udemy.LeandroLeitao.controlle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Udemy.LeandroLeitao.models.entities.Cliente;

@RestController
@RequestMapping(path = "/")
public class ClienteController {

	@GetMapping(path = "/qualquer")
	public Cliente ObterCliente() {
		return new Cliente(30, "Rafael", "042.307.111-40");
	}
//http://localhost:8080/3
	@GetMapping(path = "/{id}")
	public Cliente ObterClientePorId(@PathVariable int id) {
		return new Cliente(id, "Rafael", "042.307.111-40");
	}
	
	//http://localhost:8080/?id=3
	@GetMapping
	public Cliente ObterClientePorId2(@RequestParam(name="id") int id) {
		return new Cliente(id, "Rafael", "042.307.111-40");
	}
}