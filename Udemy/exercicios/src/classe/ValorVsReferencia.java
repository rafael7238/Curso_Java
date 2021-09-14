package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 2;
		double b = a; // Atribuição por valor (Tipo Primitido)

		a++;
		b--;
		
		System.out.println(a+"   "+b);

		Data d1 = new Data();
		d1.dia = 10;
		d1.mes = 10;
		d1.ano = 10;

		Data d2 = d1; //Atribuição por referência (Objeto)
		
		d2.ano=20;
		
		System.out.println(d1.ano+"   "+d2.ano);  //Aqui Alterou o valor
	}

}
