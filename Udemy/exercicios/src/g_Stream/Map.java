package g_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import f_lambdas.Produto;

public class Map {

	public static void main(String[] args) {

		Consumer<String> print = System.out::print;
		List<String> marcas = Arrays.asList("BMW ","Audi1 ","Honda ");
		
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "" ;
		UnaryOperator<String> grito = n -> n.charAt(0) + "!!!" ;
		
		var a = maiuscula.andThen(Utilitarios.primeiraLetra).andThen(Utilitarios.grito).apply("bmw");
		print.accept("\n"+a+"\n");
		
		marcas.stream().map(maiuscula).map(primeiraLetra).map(grito).forEach(print);
		
	
		
	}

}
