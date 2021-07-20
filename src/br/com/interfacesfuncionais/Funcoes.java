package br.com.interfacesfuncionais;

import java.util.function.Function;

public class Funcoes {
	
	public static void main(String[] args) {
		Function<String, String> retornaNomeContrario = palavra -> new StringBuilder(palavra).reverse().toString();
		Function<String, Integer> converterStringParaInteiro = string -> Integer.valueOf(string) * 2;
		
		System.out.println(retornaNomeContrario.apply("Humberto"));
		System.out.println(converterStringParaInteiro.apply("50"));
	}
}
