package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {

		Compra c1 = new Compra();
		c1.Nomecliente = "João Pedro";
		c1.adicionarItem(new Item("Papel Higiêncio", 5, 8.0));
		c1.adicionarItem(new Item("Bolacha", 9, 10.0));

		System.out.println(c1.itens.size());
		System.out.println(c1.valorTotal());
	}

}
