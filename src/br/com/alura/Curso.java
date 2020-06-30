package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<>(); // polimorfidmo = utilizar List mais generico para que no futuro possa
													// alterar para LinkedList

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas); // lista read only
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
		// return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	@Override
	public String toString() {
		return "[ Curso: " + this.nome + ", Tempo Total: " + this.getTempoTotal() + ", Aulas: " + this.aulas + " ]";
	}

}
