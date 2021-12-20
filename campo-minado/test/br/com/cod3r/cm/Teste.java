package br.com.cod3r.cm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void testarSeIgualaDois() {
		int a = 1+1;
		assertEquals(2, a);
		
	}
	
	@Test
	void testarSeDiferenteTres() {
		int a = 1+1;
		assertEquals(3, a);
		
	}
	
	@Test
	void testarSeDiferenteQuatro() {
		int a = 1+1;
		assertEquals(4, a);
		
	}
	
	@Test
	void testarSeDiferenteCinco() {
		int a = 1+4;
		assertEquals(5, a);
		
	}
}