package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class TestaCursoComAluno {

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
		
		System.out.println("Todos os alunos matriculados: ");
//		javaColecoes.getAlunos().forEach(a ->{System.out.println(a.getNome);});
		javaColecoes.getAlunos().forEach(aluno ->{System.out.println(aluno);});
		
		//transformar uma coleção comum em uma coleção para threads
//		Set<Aluno> alunosSincronizados = Collections.synchronizedSet(alunos);


	}

}
