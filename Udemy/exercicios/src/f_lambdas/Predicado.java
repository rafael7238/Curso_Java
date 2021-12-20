package f_lambdas;

import java.util.function.Predicate;

// Também é uma Intereface Funcional

public class Predicado {

	public static void main(String[] args) {
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) > 750;
		Predicate<Produto> isRetornaFalse = prod -> false;

		Produto produto = new Produto("Notebook", 5000, 0.10);
		System.out.println(isCaro.test(produto));
		System.out.println(isRetornaFalse.test(produto));

	}

}
