package oo.polimorfismo;

public class JantarMain {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(60);
		
		Comida ingrediente1 = new Arroz(15);
		Comida ingrediente2 = new Feijao(30);
		Comida ingrediente3 = new Sorvete(20);

		System.out.println("Convidade: "+ convidado.getPeso());
		convidado.Comer(ingrediente1);
		convidado.Comer(ingrediente2);
		convidado.Comer(ingrediente3);
		System.out.println("Convidade: "+ convidado.getPeso());

		
	}

}
