package a_fundamentos;

public class AreaCircuferencia {

	public static void main(String[] args) {

		double raio =  3.4;
		float raiol =  (float) 3.4;
		final double PI = 3.14159; //Quando colocamos FINAL, não é possível mudar
								   // o valor da variável
		final float PI2 = (float) 3.14159;
		double area = PI*raio;
		
		System.out.println(PI2*raiol);
		System.out.println(area);
		System.out.println(5/9);
		System.out.println(5.0/9.0);
	}

}
