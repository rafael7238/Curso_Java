package a_fundamentos;

public class ConversaoNumero {

	public static void main(String[] args) {
		
		Integer num1=1000; //Usando Wrapper
		System.out.println(num1.toString().length());
		
		int num2=10000; //Usando Tipo primitivo
		System.out.println(Integer.toString(num2).length());


	}

}
