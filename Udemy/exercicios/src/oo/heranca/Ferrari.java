package oo.heranca;

public class Ferrari extends Carro {
	
	int x = 10;

	void acelerar() {
		super.acelerar(x);
	}

	void freiar() {
		super.freiar(x);
	}
}
