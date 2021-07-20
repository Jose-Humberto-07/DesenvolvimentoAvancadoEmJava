package br.com.dio.aula01;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class Aula {
	public static void main(String[] args) {
		UnaryOperator<Integer> calcularValorVezesTrinta = valor -> valor * 3;
		int valor = 10;
		System.out.println("O resultado é : " + calcularValorVezesTrinta.apply(10));
		
		System.out.println("");
		
		String aula01 = "Primeira aula";
		String aula02 = "segunda aula";
		String aula03 = "Terceira aula";
		
		ArrayList<String> listaDeAulas = new ArrayList<>();
		
		listaDeAulas.add(aula01);
		listaDeAulas.add(aula02);
		listaDeAulas.add(aula03);
		listaDeAulas.add("testando lista em java...");
		
		System.out.println(listaDeAulas);
		
		System.out.println("");
		
		
	}
}
