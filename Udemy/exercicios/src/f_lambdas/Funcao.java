package f_lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";
		System.out.println(parOuImpar.apply(33));

		Function<String, String> oResultadoE = valor -> "O Resultado �: " + valor;
		System.out.println(oResultadoE.apply("Nada"));

		String resultadoFinal = parOuImpar.andThen(oResultadoE).apply(33); // Composi��o de Fun��o
		System.out.println(resultadoFinal);
	}

}
