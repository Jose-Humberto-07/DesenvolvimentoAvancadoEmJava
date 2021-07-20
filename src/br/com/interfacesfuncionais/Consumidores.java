package br.com.interfacesfuncionais;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Consumidores {
	
	public static void main(String[] args) {
		Consumer<String> imprimirFrase = frase -> System.out.println(frase);
		imprimirFrase.accept("Hello, word");
		
	}
}
