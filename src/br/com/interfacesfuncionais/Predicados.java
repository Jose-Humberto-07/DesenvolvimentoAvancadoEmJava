package br.com.interfacesfuncionais;

import java.util.function.Predicate;

public class Predicados {
	
	public static void main(String[] args) {
		// predicados recebem qualquer parâmetros e retornam um boolean
		
		Predicate<String> estaVazio = valor -> valor.isEmpty();
		System.out.println(estaVazio.test("Humberto"));
		System.out.println(estaVazio.test(""));
	}
}
