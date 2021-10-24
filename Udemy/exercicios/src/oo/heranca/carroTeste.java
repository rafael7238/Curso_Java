package oo.heranca;

public class carroTeste {

	public static void main(String[] args) {

		Ferrari ferrari = new Ferrari();
		System.out.println(ferrari.velocidadeAtual);

		ferrari.acelerar();
		ferrari.acelerar();
		System.out.println(ferrari.velocidadeAtual);

		ferrari.freiar();
		System.out.println(ferrari.velocidadeAtual);

		Fusca fusca = new Fusca();
		System.out.println(fusca.velocidadeAtual);
		fusca.acelerar();
		fusca.acelerar();
		System.out.println(fusca.velocidadeAtual);
		fusca.freiar();
		System.out.println(fusca.velocidadeAtual);

	}

}
