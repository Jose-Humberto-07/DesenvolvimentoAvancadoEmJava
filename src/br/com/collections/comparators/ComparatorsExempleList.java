package br.com.collections.comparators;

import java.util.ArrayList;
import java.util.List;

public class ComparatorsExempleList {
	public static void main(String[] args) {
		
		List<Estudante> estudantes = new ArrayList<>();
			
		estudantes.add(new Estudante("Pedro", 19));
		estudantes.add(new Estudante("Carlos", 23));
		estudantes.add(new Estudante("Mariana", 21));
		estudantes.add(new Estudante("João", 18));
		estudantes.add(new Estudante("Thiago", 20));
		estudantes.add(new Estudante("George", 22));
		estudantes.add(new Estudante("Larissa", 21));
		
		System.out.println("=================");
		System.out.println("ORDEM DE INSERÇÃO");
		System.out.println("=================");
		System.out.println();
		System.out.println(estudantes);
		System.out.println();
		estudantes.forEach(nome -> System.out.println(nome));
		System.out.println();
		
		
		System.out.println("=================================");
		System.out.println("ORDEM NATURAL DOS NÙMEROS - IDADE");
		System.out.println("=================================");
		estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
		System.out.println(estudantes);
		System.out.println();
		System.out.println();
		estudantes.stream()
		.forEach(nome -> System.out.println(nome));
		System.out.println();
		
		
		System.out.println("=================================");
		System.out.println("ORDEM REVERSA DOS NÙMEROS - IDADE");
		System.out.println("=================================");
		estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
		System.out.println(estudantes);
		System.out.println();
		System.out.println();
		estudantes.stream()
		.forEach(nome -> System.out.println(nome));
		System.out.println();
		
		
		System.out.println("=================================");
		System.out.println("ORDEM NATURAL DOS NÙMEROS - IDADE");
		System.out.println("=================================");
		estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
		System.out.println(estudantes);
		System.out.println();
		System.out.println();
		estudantes.stream()
		.forEach(nome -> System.out.println(nome));
		System.out.println();
	}
}
