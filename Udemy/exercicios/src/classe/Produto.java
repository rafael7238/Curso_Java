package classe;

public class Produto {

	String nome;
	double preco;
	double desconto;

	double precoComDesconto() {

		return this.preco * (1 - this.desconto);
	}

	Produto(String nomeInicial) {
		nome = nomeInicial;
	}

	Produto() {
	}

}