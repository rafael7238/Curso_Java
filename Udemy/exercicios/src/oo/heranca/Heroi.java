package oo.heranca;

public class Heroi extends Jogador{

	boolean atacar (Jogador oponente) {
		
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		
		return ataque1 || ataque2;
	}
	
	/*boolean atacar(Jogador oponente) {
		
		int deltax = Math.abs(x-oponente.x);
		int deltay = Math.abs(y-oponente.y);
		
		if (deltax==0 && deltay==1) {
			 
			oponente.vida -= 10;	
			return true;
		}
		
		else if (deltax == 1 && deltay==0) {
			oponente.vida-=10;
			return true;
		}
		
		return false;
	}
	
	boolean andar(Direcao direcao) {
		
		switch (direcao) {
		case NORTE:
			y--;
			break;	
		
		case LESTE:
			x++;
			break;
			
		case SUL:
			y++;
			break;
			
		case OESTE:
			x--;
			break;
		}
		
		
		return true;
	}*/
}
