package com.Udemy.LeandroLeitao.controlle;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Udemy.LeandroLeitao.models.entities.Produto;

@RestController
@RequestMapping(path = "api/produtos")
public class ProdutoController {

	@PostMapping
	public Produto novoProduto(@RequestParam String nome) {
		Produto produto = new Produto(nome);

		return produto;
	}
}
