package br.com.alura;

public class TestaBuscaAlunosNoCurso {
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 23658);
		Aluno a2 = new Aluno("Guilherme Silveira", 98756);
		Aluno a3 = new Aluno("Mauricio Aniche", 45216);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem é o aluno com matricula 23658?");
		Aluno aluno= javaColecoes.buscaMatriculado(23658);
		System.out.println("Aluno: "+ aluno.getNome());
	}

}
