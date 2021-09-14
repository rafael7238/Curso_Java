package d_colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> pilha = new ArrayDeque<String>(); // Primeiro a Entrrar, ultimo a sair

		pilha.push("Livro 1"); //Retorna valor booleano
		pilha.push("Livro 2"); //Não retorna nada
		pilha.push("Livro 3");
		pilha.push("Livro 4");

		System.out.println(pilha.peek());
		 System.out.println(pilha.poll());
		 System.out.println(pilha.peek());

	}
}
