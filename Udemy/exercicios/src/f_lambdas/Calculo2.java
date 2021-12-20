package f_lambdas;

public class Calculo2 {
	
	public static void main(String[] args) {
		
		Calculo calc = (x,y) -> {return x+y;}; // O Java busca a função de Calculo
		
		System.out.println(calc.executar(2, 4));
		
		calc = (x,y) -> x*y; // Está explícito que vai ter retorno o valor
		
		System.out.println(calc.executar(2, 4));
		System.out.println(calc.legal());
		System.out.println(Calculo.muitoLegal());
		

	}
}
