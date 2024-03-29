package br.com.collections.optional;

import java.util.Optional;

public class ExemploOptionalEstados {
	
	public static void main(String[] args) {
		Optional<String> optionalString = Optional.of("valor presente");
		
		System.out.println("Valor opcional que est� presente ");
		optionalString.ifPresentOrElse(valor -> System.out.println(valor), () -> System.out.println("n�o est� presente"));
		
		Optional<String> optionalNull = Optional.ofNullable(null);
		
		System.out.println("Valor opcional que n�o est� presente");
		optionalNull.ifPresentOrElse(valor -> System.out.println(valor), () -> System.out.println("null = n�o est� presente"));
		
		Optional<String> emptyOptional = Optional.empty();
		
		System.out.println("Valor opcional que n�o est� presente");
		emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = n�o est� presente"));
		
		Optional<String> optionalNullErro = Optional.of(null);
		
		System.out.println("Valor opcional que lanca erro NullPointerException");
		optionalNullErro.ifPresentOrElse(valor -> System.out.println(valor), () -> System.out.println("erro = n�o est� presente"));
	}
}
