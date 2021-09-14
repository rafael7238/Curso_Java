package com.Udemy.LeandroLeitao.controlle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

	@GetMapping(path = {"/ola","/saudacao"})
	//@RequestMapping(method = RequestMethod.GET,path = "/Ola")
	public String Ola() {
		return "Olá String";
	}
	
}
