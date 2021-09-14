package com.digitalinnovation.stringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
	@GetMapping(path = {"/ola","/saudacao"}) //Pode ser usado em nível de método
	//@RequestMapping(method = RequestMethod.GET,path = "/ola") //Nível de Classe
	public String Ola() {
		return "Olá Mundo!";
	}
}
