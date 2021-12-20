package g_Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class imprimindoObjetos {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("Bia","Ana","Teu");
		
		for(int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		
		for(String nome:lista) {
			System.out.println(nome);
		}
		
		//Iteratorr
		Iterator<String> iterator = lista.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//Stream
		
		Stream<String> st = lista.stream();
		st.forEach(System.out::println);
	}

}
