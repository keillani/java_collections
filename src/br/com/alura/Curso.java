package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<>(); // polimorfidmo = utilizar List mais generico para que no futuro possa alterar para LinkedList
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
//	private Set<Aluno> alunos = new LinkedHashSet<>(); //O LinkedHashSet nos dá a performance de um HashSet mas com acesso previsível e ordenado.
	
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

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);	
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}

	// método que devolve o Set mas de maneira não modificável
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
//		for (Aluno aluno : alunos) {
//			if(aluno.getNumeroMatricula() == numero)
//			return aluno;
//		}
//			throw new NoSuchElementException("Matricula nao encontrada "+ numero);
		if(!matriculaParaAluno.containsKey(numero)) {
			throw new NoSuchElementException("numero de matricula nao pode ser nulo: "+ numero);
		}
		return matriculaParaAluno.get(numero);

	}

}
