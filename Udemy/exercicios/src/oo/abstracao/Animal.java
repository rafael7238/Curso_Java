package oo.abstracao;

// Classe Abstract não é possível instanciar.
	// Animal a = New Animal();  Vai dar erro.
// Métodos abstratos não tem corpo.

public abstract class Animal {
	public abstract void fazerBarulho();
	public String nome() {
		return "nome";
	}
}
