package br.com.collections.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import br.com.collections.comparators.Estudante;

public class ExemploStramAPI {
	
	public static void main(String[] args) {
		
		List<String> estudantes = new ArrayList<>();
		
		estudantes.add("Pedro");
		estudantes.add("Thayse");
		estudantes.add("Marcelo");
		estudantes.add("Carla");
		estudantes.add("Juliana");
		estudantes.add("Thiago");
		estudantes.add("Rafael");
		estudantes.add("Bruno");
		estudantes.add("Feliciano");
		estudantes.add("Cristiano");
		estudantes.add("Messi");
		estudantes.add("Neymar");
		
		System.out.println("Contagem: " + estudantes.stream().count());
		
		System.out.println("Maior número de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));
		
		System.out.println("Menor número de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));
		
		System.out.println("Com a letra R no nome: " + estudantes.stream().filter((nome) -> nome.toLowerCase().contains("r")).collect(Collectors.toList()));
		
		System.out.println("Retorna uma nova coleção com a quantidade de letras: " + estudantes.stream()
		.map(nome -> nome.concat(" - ").concat(String.valueOf(nome.length()))).collect(Collectors.toList()));
		System.out.println();
		
		System.out.println("Retorna os 3 primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));
		
		System.out.println("Mostrar os elementos");
		estudantes.stream().forEach(System.out::println);
		System.out.println();
		
		System.out.println("Tem algum elemnto com w no nome? " + estudantes.stream().allMatch(elemento -> elemento.contains("w")));
		
		System.out.println("Tem algum elemento com maiúscula no nome? " + estudantes.stream().anyMatch(nome -> nome.contains("a")));
		
		System.out.println("Não tem nenhum elemento com a minúscula no nome? " + estudantes.stream().noneMatch(nome -> nome.contains("a")));
		
		System.out.println("Retorna o primeiro elemento da coleção se estiver no console");
		estudantes.stream().findFirst().ifPresent(System.out::println);
		System.out.println();
		//Exemplo de operação encadeada (é o mais comun)
		System.out.println("Operação encadeada: ");
		System.out.println(estudantes.stream()
				.peek(System.out::println)
				.map(nome -> nome.concat(" - ").concat(String.valueOf(nome.length())))
				.peek(System.out::println)
				.filter(nome -> nome.toLowerCase().contains("r"))
				.collect(Collectors.toList())
		);

	}
}
