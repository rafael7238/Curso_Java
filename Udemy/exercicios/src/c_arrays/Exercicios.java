package c_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {

		double[] notasAlunoA = new double[3];

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;

		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);

		for (double d : notasAlunoA) {
			System.out.println(d);
		}

		double[] notasAlunos = { 9.8, 5.4, 10.8 };
		
		
		///
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Quantas horas: ");
		
		int qtdeNotas = entrada.nextInt();
		double[] notas = new double[qtdeNotas];

	}

}