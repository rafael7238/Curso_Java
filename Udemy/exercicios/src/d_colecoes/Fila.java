package d_colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		fila.add("Ana"); // Gera um erro caso de erro ao adicionar
		fila.offer("Bia"); // Retorna verdadeiro ou falso ao adicionar

		System.out.println(fila.peek()); // Retorna o primeiro elemento da lista
		System.out.println(fila.peek()); // Retorna o primeiro elemento da lista

		// fila.clear(); //Limpar a Fila

		System.out.println(fila.poll()); // Retorna o primeiro elemento da lista, removendo
		System.out.println(fila.poll()); // Retorna o primeiro elemento da lista, removendo
		System.out.println(fila);

	}

}
