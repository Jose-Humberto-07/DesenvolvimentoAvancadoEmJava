package br.com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {
	//set 
	//não tem ordanação, não tem duplicatas e é performático
	public static void main(String[] args) {
		
		Set<Double> notasAlunos = new HashSet<>();
		
		notasAlunos.add(5.8);
		notasAlunos.add(9.3);
		notasAlunos.add(6.5);
		notasAlunos.add(10.0);
		notasAlunos.add(5.4);
		notasAlunos.add(7.3);
		notasAlunos.add(3.8);
		notasAlunos.add(4.0);
		
		System.out.println(notasAlunos);
		
		notasAlunos.remove(3.8);
		
		System.out.println(notasAlunos);
		
		System.out.println(notasAlunos.size());
		System.out.println();
		
		//navega em todos os itens do iterator
		Iterator<Double> iterator = notasAlunos.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println();
		
		notasAlunos.stream()
		.forEach(numero -> System.out.println(numero));
		
		System.out.println();
		
		System.out.println("Sabar se está vazio: " + notasAlunos.isEmpty());
	}
}
