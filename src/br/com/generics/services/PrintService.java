package br.com.generics.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<TypeGeneric> {

	List<TypeGeneric> list = new ArrayList<>();
	
	public void addValue(TypeGeneric value) {
		list.add(value);
	}
	
	public TypeGeneric first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}
}
