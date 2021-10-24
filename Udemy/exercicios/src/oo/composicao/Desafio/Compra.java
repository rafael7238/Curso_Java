package oo.composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	final List<ITem> itens = new ArrayList<>();

	void adicionarItem(Produto p, int qtd) {

		this.itens.add(new ITem(p, qtd));
	}

	void adicionarItem(String nome, double preco, int qtd) {
		var p = new Produto(nome, preco);
		this.itens.add(new ITem(p, qtd));
	}

	double obterValorTotal() {
		double total = 0;

		for (ITem item : itens) {
			total += item.quantidade * item.produto.preco;
		}
		return total;
	}
}
