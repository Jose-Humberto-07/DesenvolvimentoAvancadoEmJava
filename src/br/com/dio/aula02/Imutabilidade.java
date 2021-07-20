package br.com.dio.aula02;

import java.util.function.UnaryOperator;

public class Imutabilidade {
	
	public static void main(String[] args) {
		int valor = 20;
		
		UnaryOperator<Integer> retornarDobro = v -> v * 2;
		System.out.println(retornarDobro.apply(valor));// retorna o dobro do valor
		System.out.println(valor);// o valor não vai mudar
	}
}
