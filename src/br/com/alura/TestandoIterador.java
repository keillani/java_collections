package br.com.alura;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestandoIterador {

	public static void main(String[] args) {
		
		//percorrer a lista com java 
//		List<String> letras = new LinkedList<>();
//		letras.add("A");
//		letras.add("B");
//		letras.add("C");
//
//		letras.forEach(letra -> {
//		    System.out.println(letra);
//		});

		
		//percorrer a lista a moda antiga com iterator
        List<String> letras = new LinkedList<>();
        letras.add("A");
        letras.add("B");
        letras.add("C");
        
        Iterator<String> iterador = letras.iterator();
        while(iterador.hasNext()) {
        	System.out.println(iterador.next());
        }
	}

}
