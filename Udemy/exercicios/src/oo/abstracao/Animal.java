package oo.abstracao;

// Classe Abstract n�o � poss�vel instanciar.
	// Animal a = New Animal();  Vai dar erro.
// M�todos abstratos n�o tem corpo.

public abstract class Animal {
	public abstract void fazerBarulho();
	public String nome() {
		return "nome";
	}
}
