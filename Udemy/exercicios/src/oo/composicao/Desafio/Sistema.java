package oo.composicao.Desafio;

public class Sistema {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		Compra compra2 = new Compra();

		
		compra1.adicionarItem("Caneta", 9.67,100);
		compra2.adicionarItem("Caderno", 19.67,5);
		compra2.adicionarItem(new Produto("Impressora",998.0), 12);
		
		Cliente cliente = new Cliente("Rafael Vasconcelos");
		
		cliente.adicionarCompra(compra1);
		cliente.adicionarCompra(compra2);
		
		System.out.println(cliente.obterValorTotal());

	}

}