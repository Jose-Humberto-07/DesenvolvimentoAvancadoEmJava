package br.com.iteracoesentrefuncoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Iteracoes {
	
	public static void main(String[] args) {
		String[] nomes = {"java", "João", "Paulo", "Santos", "Instrutor", "java"};
		Integer[] numeros = {1, 2, 3, 4, 5};
		imprimirNomesFiltrados("Humberto");
		imprimirNomesFiltrados("java");
		System.out.println();
		imprimirTodosNomes(nomes);
		System.out.println();
		imprimirDobroDeCadaItemDaLista(numeros);
		
		System.out.println();
		
		ArrayList<String> Profissoes = new ArrayList<>();
		Profissoes.add("Desenvolvedor");
		Profissoes.add(("Tester"));
		Profissoes.add(("Gerente de projeto"));
		Profissoes.add("Gerente de qualidade");
		
		Profissoes.stream()
		.filter(nome -> nome.startsWith("Gerente"))
		.forEach(nome -> System.out.println(nome));
		
	}
	
	
	
	public static void imprimirNomesFiltrados(String...nomes) {
		
		String nomesParaIprimir = "";
		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].equals("java")) {
				nomesParaIprimir += nomes[i];
			}
			
		}
		System.out.println("Nomes do for: " + nomesParaIprimir);
		
		System.out.println();
		
		String nomesParaImprimirDaStream = Stream.of(nomes)
		.filter(nome -> nome.equals("java"))
		.collect(Collectors.joining());// String
		System.out.println("Nomes do stream: " + nomesParaImprimirDaStream);
			
	}
	
	public static void imprimirTodosNomes(String...nomes) {
		for (String nome : nomes) {
			System.out.println("Imprimido pelo for: " + nome);
		}
		
		System.out.println();
		
		Stream.of(nomes)
		.forEach(nome -> System.out.println("Imprimido pelo stream: " + nome));
		
	}
	
	public static void imprimirDobroDeCadaItemDaLista(Integer... numeros) {
		for (int numero : numeros) {
			System.out.println(numero * 2);
		}
		
		System.out.println();
		
		Stream.of(numeros)
		.map(numero -> numero * 2)
		.forEach(numero -> System.out.println("tranforamdo pelo map: " + numero));
	}
	
	
}
