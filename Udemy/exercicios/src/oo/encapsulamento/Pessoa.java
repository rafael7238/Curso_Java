package oo.encapsulamento;

public class Pessoa {
	
	private int idade;
	
	protected String nome;
	
	public Pessoa(int idade) {
		setIdade(idade);
	}
	
	//Getter 
	public int getIdade() {
		return this.idade;
	}
	
	//Setter
	public void setIdade(int idade) {
		idade = Math.abs(idade);
		if(idade>=0 && idade<=120) {
			this.idade=idade;
		}
	}

}
