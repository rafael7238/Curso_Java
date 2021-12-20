package h_excessoes;

public class ChecadavsNaoChecada {

	public static void main(String[] args)  {

		try {
			try {
				geraErro1();
			} catch (RuntimeException e) {
				System.out.println("Fim: " + e.getMessage());
				throw new Exception("nada");
			}
			try {
				geraErro2();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Fim: " + e.getMessage());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("passou aqui");
			e.getMessage();
		}
		
		//geraErro2();
		geraErro1();

		System.out.println("Fim: ");

	}

	private static void geraErro1()  {
		throw new RuntimeException("Ocorreu um erro bem legal!!");

	}

	private static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #2!!");

	}

}
