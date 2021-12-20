package h_excessoes.personalizada;

public class Validar {

	public static void main(String[] args) {
		
		/*if (null == null) {
			throw new IllegalArgumentException("O aluno está nulo!");
		}*/

		try {
			if ("null" == null || "Rafael".trim().isEmpty()) {
				throw new StringVaziaException("Nome");
			}
			
			if (null== null || "Rafael".trim().isEmpty()) {
				throw new NumeroNegativoException("Nome");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
