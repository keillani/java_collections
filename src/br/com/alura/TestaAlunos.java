package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {

		//hashset tabela de espalhamento
		Collection<String> alunos = new HashSet<>(); // conjunto = set não tem garantia de ordem de inclusao mas nao duplica elemento
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Mauricio Aniche");
		alunos.add("Alberto Souza");
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Siveira");
		System.out.println(pauloEstaMatriculado);

		System.out.println(alunos.size());

		for (String aluno : alunos) {
			System.out.println(aluno);
		}

		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});

		System.out.println(alunos);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		Collections.sort(alunosEmLista);
		System.out.println(alunosEmLista);
	}

}
