package br.com.alura;

import java.util.Collections;
import java.util.Set;

//Por exemplo, imagina que voc� precisa representar um curso que foi cancelado pois n�o teve matriculas
public class TesteEmptySet {

	public static void main(String[] args) {
	        Set<String> nomes = Collections.emptySet();
	        nomes.add("Paulo"); // Um conjunto destinado a ser vazio n�o pode ter um elemento retornando excecao
	    }
}
