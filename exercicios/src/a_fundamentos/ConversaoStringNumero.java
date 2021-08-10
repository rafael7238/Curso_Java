package a_fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
public static void main(String[] args) {
		
		String valor1 = JOptionPane
					   .showInputDialog("Digite o primeiro número: ");
		String valor2 = JOptionPane
				   .showInputDialog("Digite o Segundo número: ");
		
		System.out.println(valor1+valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1+numero2; //7.9 + 8.4 o somatório tem valor preciso
									   //7.9 + 8.3 o somatorio não tem valor preciso
		
		System.out.println("Soma é "+soma);
		System.out.println("Média é "+soma/2);




	}
}
