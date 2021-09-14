package com.Udemy.LeandroLeitao.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.Udemy.LeandroLeitao.models.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}