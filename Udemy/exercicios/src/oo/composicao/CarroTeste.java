package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {

		Carro c = new Carro();
		System.out.println(c.estaLigado());
		c.ligar();
		System.out.println(c.estaLigado());
		System.out.println(c.motor.giros());
		System.out.println(c.motor.giros());
		
		//Faltou o Encapsulamento!!
		//c1.moto.fatorInjeção
		

	}
}
