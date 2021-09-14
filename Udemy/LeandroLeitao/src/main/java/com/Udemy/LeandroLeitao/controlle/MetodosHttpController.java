package com.Udemy.LeandroLeitao.controlle;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metodo")
public class MetodosHttpController {

	@GetMapping
	public String get() {
		return "Requisição Get";
	}
	
	@PostMapping
	public String post() {
		return "Requisição Post";
	}
	
	@PutMapping
	public String put() {
		return "Requisição Put";
	}
	
	@PatchMapping
	public String patch() {
		return "Requisição Patch";
	}
	
	@DeleteMapping
	public String delete() {
		return "Requisição Delete";
	}
	
		
}