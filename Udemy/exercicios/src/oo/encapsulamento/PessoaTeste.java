package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa (45);
		p1.setIdade(30);
		
		p1.nome="Rafael";
		
		System.out.println(p1.getIdade());
		System.out.println(p1.nome);


	}

}
