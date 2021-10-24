package oo.heranca;

public class Fusca  extends Carro {
	
	int x = 5;

	void acelerar() {
		super.acelerar(x);
	}

	void freiar() {
		super.freiar(x);
	}
}
