package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {

		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe aula";
		String aula3 = "Trabahando com cursos e sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);

		aulas.remove(0);

		System.out.println(aulas);

		// for each para percorrer a lista
		for (String aula : aulas) { // para cada aula dentro aulas faça
			System.out.println("Aula: " + aula);
		}

		String primeiraAula = aulas.get(0);
		System.out.println("A nossa primeira aula é " + primeiraAula);

		// for para percorrer a lista
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("aula: " + aulas.get(i));
		}

		System.out.println(aulas.size());

		// método foreach
		aulas.forEach(aula -> {
			System.out.println("percorrendo");
			System.out.println("aula: " + aula);
		});
		
		aulas.add("Aumentando nosso conhecimento");
		Collections.sort(aulas);
		System.out.println("Depois de ordenado: "+aulas);
		Collections.reverse(aulas);
		System.out.println("Depois de ordenado inverso: "+ aulas);
	}

}
