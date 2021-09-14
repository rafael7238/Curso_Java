package d_colecoes;

import java.util.ArrayList;
import java.util.TreeSet;

public class Lista {
	
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		lista.add(new Usuario("Carlos"));				
		lista.add(new Usuario("Ana"));
		lista.add(new Usuario("Luca"));
		lista.add(new Usuario("Pedro"));
		
		for (Usuario usu : lista) {
			System.out.println(usu.nome);
			System.out.println(usu);
		}
		
		System.out.println(lista.get(3));		
		System.out.println(lista.contains(new Usuario("Pedro")));
		
		//lista.notify();
	}
}
