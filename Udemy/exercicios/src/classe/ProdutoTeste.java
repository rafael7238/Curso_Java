package classe;

public class ProdutoTeste {
	public static void main(String[] args) {

		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;

		var p2 = new Produto();

		p2.nome = "Notebook";
		p2.preco = 4356.89;
		p2.desconto = 0.25;

		System.out.println(p2.precoComDesconto());

	}

}