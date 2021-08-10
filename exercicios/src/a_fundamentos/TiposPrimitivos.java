package a_fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		//Tipos Inteiros
		byte anoDeEmpresa = 23;
		short numeroDeVoos=542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L; //O '_' Separada os pontos
												//Para ficar mais leg�vel.
												//Uso o L para dizer que � Long
												//Sen�o ele entende que � um Int
		
		//Tipos num�ricos reais
		float salario = 11_445.44F;
		float salario2 = 4.44F; //Tem que colocar o F sen�o considera Double
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipos Boolenano
		boolean estaDeFerias = false;
		
		//Tipos Caracteres
		char status = 'A'; //S� aceita um caracter
		char unicod = '\u0010' ; //Consido salvar o Unicode tamb�m
		
		//String
		String s ="Bom Dia!!";
		s="Boa tarde";
		var novo_valor=s.toUpperCase();
		var replace = s.replace("!", "!!");
		var concat = s.concat("!!!!");
		System.out.println(s+' '+ novo_valor+' '+replace +' '+concat);
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.equals("Boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		System.out.println("Nome: %s");
		


	}

}