package oo.composicao;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("João");
		Aluno aluno3 = new Aluno("João");
		Aluno aluno4 = new Aluno("João");
		Aluno aluno5 = new Aluno("João");

		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("DevOps");
		Curso curso3 = new Curso("Flutter");

		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		curso2.adicionarAluno(aluno3);

		aluno1.adicionarCurso(curso1);

		Curso a = aluno1.obterCursoPorNome("Java");

		if (a != null) {
			System.out.println(a.nome);
		} else
			System.out.println(a.nome);
	}
}
