package f_lambdas;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.List;

public class Consumidor {
	public static void main(String [] args) {
		Consumer<Produto> produto = p->System.out.println(p.nome);
		
		Produto p1 = new Produto("Carro",80000,0.10);
		Produto p2 = new Produto("Notebook",5000,0.10);
		Produto p3 = new Produto("Caderno",35,0.10);
		Produto p4 = new Produto("Caneta",4,0.10);

		
		produto.accept(p1);
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4);  
		
		produtos.forEach(produto);
		
		produtos.forEach(p-> System.out.println(p.preco));
		
		
	}
}
