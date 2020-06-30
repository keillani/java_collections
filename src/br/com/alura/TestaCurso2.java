package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);

		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		Collections.reverse(aulas); //lista em ordem reversa
		Collections.shuffle(aulas); //embaralha ordem randomica os itens da lista
		Collections.singletonList(aulas); //devolve uma lista imutável que contêm um único elemento especificado. Ele é útil quando precisamos passar um único elemento para uma API que só aceita uma Collections daquele elemento
		Collections.sort(aulas); //ordena elementos de uma lista
		System.out.println(aulas);
		System.out.println("tempo total: " + javaColecoes.getTempoTotal());

		System.out.println(javaColecoes);
	
	}

}
