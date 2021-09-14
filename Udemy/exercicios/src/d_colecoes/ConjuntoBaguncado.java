package d_colecoes;

import java.util.HashSet;
import java.util.Set;




public class ConjuntoBaguncado {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		conjunto.add('x'); //Elemento Repetitivo. Não vai considerar
		
		//System.out.println(conjunto.size());
		
		conjunto.remove('x');
		//System.out.println(conjunto.size());
		conjunto.add('x');
		//System.out.println(conjunto.size());
		//System.out.println(conjunto.contains('x'));
		
		Set nums = new HashSet();		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		//System.out.println(nums);
		//System.out.println(conjunto);
		
		conjunto.addAll(nums); //União entre dois conjuntos
		
		
		Set a = new HashSet();
		a = conjunto; //Vai reter apenas o que está igual
		//a = a.retainAll(nums);
		System.out.println(nums);
		System.out.println(conjunto);
		
		System.out.println(a);
		a.retainAll(nums);
		System.out.println(a);
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		
	}

}
