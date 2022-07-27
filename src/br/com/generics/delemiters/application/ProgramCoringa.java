package br.com.generics.delemiters.application;

import java.util.Arrays;
import java.util.List;

public class ProgramCoringa {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

	/*
	 * Tipo coringa serve pra imprimir uma collection de qualquer tipo por exemplo.
	 * 
	 * Por�m n�o � poss�vel adicionar dados a uma cole��o de tipo curinga
	 * 
	 * 
	 * public static void main(String[] args) { List<?> list = new
	 * ArrayList<Integer>(); list.add(3); // erro de compila��o }
	 */

}
