package a_fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
public static void main(String[] args) {
		
		String valor1 = JOptionPane
					   .showInputDialog("Digite o primeiro n�mero: ");
		String valor2 = JOptionPane
				   .showInputDialog("Digite o Segundo n�mero: ");
		
		System.out.println(valor1+valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1+numero2; //7.9 + 8.4 o somat�rio tem valor preciso
									   //7.9 + 8.3 o somatorio n�o tem valor preciso
		
		System.out.println("Soma � "+soma);
		System.out.println("M�dia � "+soma/2);




	}
}
