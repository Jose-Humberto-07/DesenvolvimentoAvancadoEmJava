package br.com.dio.aula02;

import java.util.ArrayList;
import java.util.Arrays;


public class ImperativaVsDeclarativaOuFuncional {
	
	public static void main(String[] args) {
		int[] valores = {1, 2, 3, 4};
		
		//funcional
		
		Arrays.stream(valores)
				.filter(numero -> numero % 2 == 0)
				.map(numero -> numero * 2)
				.forEach(numero -> System.out.println(numero));
		
		
		//imperativo (sequencial)
		
		for (int i = 0; i < valores.length; i++) {
			int valor = 0;
			if (valores[i] % 2 == 0) {
				valor = valores[i] * 2;
				
				if (valor != 0) {
					System.out.println(valor);
				}
			} 
		}
		
		
		ArrayList<Integer> valoresInteiros = new ArrayList<>();
		
		valoresInteiros.add(2);
		valoresInteiros.add(2);
		valoresInteiros.add(2);
		valoresInteiros.add(2);
		
		System.out.println(valoresInteiros);
		valoresInteiros.forEach(valor -> System.out.println(valor));
		System.out.println();
		valoresInteiros.remove(0);
		valoresInteiros.forEach(valor -> System.out.println(valor));
		
	}
}
