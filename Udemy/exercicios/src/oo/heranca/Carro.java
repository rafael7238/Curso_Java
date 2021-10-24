package oo.heranca;

public class Carro {

	int velocidadeAtual = 50;
	
	void acelerar(int x) {
		
		if(velocidadeAtual-x>0)
		velocidadeAtual +=x;
		
			
	}
	
	void freiar (int x) {
		if(velocidadeAtual-x>0)
		velocidadeAtual -=x;
	}

}
