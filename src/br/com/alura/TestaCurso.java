package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		List<Aula> aulas = javaColecoes.getAulas(); //lista vazia pois não foi adicionada aulas
		System.out.println(aulas);
		
//		aulas.add(new Aula("Trabalhando com ArrayList",21));
//		javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList",21));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21)); //método da classe Curso
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções",23));
		
		System.out.println(javaColecoes.getAulas());
	}

}
