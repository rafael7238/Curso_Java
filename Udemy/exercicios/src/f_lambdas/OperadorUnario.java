package f_lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n+2;
		UnaryOperator<Integer> vezesDois = n -> n*2;
		UnaryOperator<Integer> aoQuadradoDois = n -> n*n;
		
		int resutado = maisDois.andThen(vezesDois).andThen(aoQuadradoDois).apply(0);
		int resutado2 = aoQuadradoDois.compose(vezesDois).compose(maisDois).apply(0);
					//Compose faz o contrário. Antes de chamar um, chama outro.

		
		System.out.println(maisDois.apply(10));
		System.out.println(vezesDois.apply(10));
		System.out.println(aoQuadradoDois.apply(10));
		
		System.out.println(resutado + " " + resutado2 );
		
		




	}

}
