package com.Udemy.LeandroLeitao.controlle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculadora")
public class CalculadoraController {
    
	//http://localhost:8080/calculadora/somar/23/24
	@GetMapping(path = "/somar/{a}/{b}")
	public int somar(@PathVariable int a, @PathVariable int b) {
    	return a+b;
    }
	
	//http://localhost:8080/calculadora/subtrair?a=32&b=4
	@GetMapping(path = "/subtrair")
	public int subtrair(@RequestParam(name="a") int a,@RequestParam(name="b") int b) {
    	return a-b;
    }
	
	
}
