package a_fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioScanner {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro Sal�rio");
		String valor1 = entrada.next().replace(",", ".");
		
		System.out.println("Informe o segundo Sal�rio");
		String valor2 = entrada.next().replace(",", ".");

		
		System.out.println("Informe o terceiro Sal�rio");
		String valor3 = entrada.next().replace(",", ".");
		
		float media = (float) (Float.parseFloat(valor3)+Float.parseFloat(valor2)
			+Float.parseFloat(valor3))/3;
		
		System.out.println("A m�dia dos sal�rios � "+ media);
		
		double mediaDouble =  (Double.parseDouble(valor3)+Double.parseDouble(valor2)
		+Double.parseDouble(valor3))/3;
		System.out.println("A m�dia dos sal�rios � "+ mediaDouble);



		entrada.close();
		
		System.out.println(Locale.getDefault(Locale.Category.DISPLAY));
		Locale.setDefault(new Locale("en","US"));
		System.out.println(Locale.getDefault(Locale.Category.FORMAT));

	}

}
