package f_lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Ana", "Bia", "Gui");

		System.out.println("Forma Tradicional....");
		for (String nome : aprovados) {
			System.out.println(nome);
		}

		System.out.println("\nLambda #1....");
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));

		System.out.println("\nMethod Reference....");
		aprovados.forEach(System.out::println);

		System.out.println("\nMethod Reference #2....");
		aprovados.forEach(Foreach::meuImprimir);

	}

	static void meuImprimir(String nome) {
		System.out.println("Oi, meu nome �: " + nome);
	}
}