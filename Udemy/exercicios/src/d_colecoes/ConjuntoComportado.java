package d_colecoes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
		Set<String> lista = new HashSet<>(); //Não considero a ordem que coloquei
		lista.add("Ana");
		lista.add("Carlos");
		lista.add("Luca");
		lista.add("Luca");
		lista.add("Pedro");
		
		Set<String> lista1 = new LinkedHashSet<>(); //Considero a ordem que coloquei
		lista1.add("Carlos");
		lista1.add("Ana");
		lista1.add("Luca");
		lista1.add("Pedro");
		
		SortedSet<String> lista2 = new TreeSet<>(); //Ordena
		lista2.add("Carlos");
		lista2.add("Ana");
		lista2.add("Luca");
		lista2.add("Pedro");
				
		lista.forEach(a -> System.out.println(a));
		System.out.println("XXXXXXX");
		lista1.forEach(a -> System.out.println(a));
		System.out.println("XXXXXXX");
		lista2.forEach(a -> System.out.println(a));
		
	}
}
