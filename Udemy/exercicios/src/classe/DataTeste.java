package classe;

public class DataTeste {

	public static void main(String[] args) {

		Data data = new Data();
		data.dia = 16;
		data.mes = 10;
		data.ano = 2015;

		String s =data.obterDataFormatada();
		System.out.println(s);

	}

}
