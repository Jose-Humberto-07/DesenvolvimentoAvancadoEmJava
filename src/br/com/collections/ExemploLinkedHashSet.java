package br.com.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
	//mantém as ordem em que os elementos foram adicionados (mas é mais lento que o hashset)
	public static void main(String[] args) {
		LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();
		
		sequenciaNumerica.add(1);
		sequenciaNumerica.add(2);
		sequenciaNumerica.add(4);
		sequenciaNumerica.add(8);
		sequenciaNumerica.add(16);
		
		System.out.println(sequenciaNumerica);
		
		sequenciaNumerica.remove(4);
		
		System.out.println(sequenciaNumerica);
		
		System.out.println(sequenciaNumerica.size());
		
		Iterator<Integer> iterator = sequenciaNumerica.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println();
		
		for (Integer n: sequenciaNumerica) {
			System.out.println(n);
		}
		
		System.out.println();
		
		sequenciaNumerica.stream()
		.forEach(n -> System.out.println(n));
	}
}
