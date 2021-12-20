package h_excessoes;

public class Basico {

	public static void main(String[] args) {

		Aluno a1 = null;
		imprimirAluno(a1);

		try {
			System.out.println(7 / 0);
		} catch (Exception ex) {
			System.out.println("Não foi possível fazer a divisão: "+ ex.getMessage());
		}
	}

	public static void imprimirAluno(Aluno aluno) {

		System.out.println(aluno == null ? "Vazio" : "Não Vazio");
	}

}
