package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		
		Jogador j1 = new Jogador();
		j1.x=10;
		j1.y=20;
		
		Jogador j2 = new Heroi();
		j1.x=10;
		j1.y=20;
		
		Heroi j3 = new Heroi();
		j1.x=10;
		j1.y=20;
		
		var a = j1.andar(Direcao.NORTE);
		
		System.out.print(j1.y);

	}

}
