package a_fundamentos;

import java.util.ArrayList;

import d_colecoes.Usuario;

public class ConversoesTipo {

	public static void main(String[] args) {
		
		try {
			ArrayList<String> lista = new ArrayList<>();
			
			double a = 1; //Conversão IMplícita
			System.out.println(a);
			
			float b = (float) 1.123456788888; //Conversão Explícita
			System.out.println(b);
			
			double c = 1.123456788888; //Conversão Explícita
			System.out.println(c);
			
			int y = (int)10/0;
			System.out.print("PAssou Aqui");
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
		

	}

}
