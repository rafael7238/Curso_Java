package b_EstruturaDeControle;

import java.util.Scanner;

public class IF {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double media = entrada.nextDouble();

		if (media >= 7)
			System.out.println("Média maior que 7");
		else
			System.out.println("Média menor que 7");

		entrada.close();
	}
}