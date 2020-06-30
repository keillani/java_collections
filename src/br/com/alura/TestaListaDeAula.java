package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
	
	public static void main(String[] args) {
		
		Aula a1 = new Aula ("Revistando as ArrayLists",24);
		Aula a2 = new Aula("Listas de objetos", 15);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 21);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		//as linhas abaixo tem o mesmo efeito de comparacao
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		//aulas.sort(Comparator.comparing(Aula::getTempo))
		
		System.out.println(aulas);

	}

}
