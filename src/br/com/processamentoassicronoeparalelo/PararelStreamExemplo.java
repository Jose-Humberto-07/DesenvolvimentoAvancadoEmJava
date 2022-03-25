package br.com.processamentoassicronoeparalelo;

import java.util.stream.IntStream;

public class PararelStreamExemplo {
	
	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		IntStream.range(1, 10)
					.forEach(numero -> System.out.println(fatorial(numero)));
		long fim = System.currentTimeMillis();
		
		System.out.println("Tempe de execução síncrono: " + (fim - inicio));
		
		System.out.println();
		
		 inicio = System.currentTimeMillis();
		IntStream.range(1, 10)
					.parallel()
					.forEach(numero -> System.out.println(fatorial(numero)));
		 fim = System.currentTimeMillis();
		
		System.out.println("Tempe de execução assíncrono: " + (fim - inicio));
	}
	
	public static long fatorial(long num) {
		long fat = 1;
		
		for (long i = 2; i <= num; i++) {
			fat *= i;
		}
		
		return fat;
	}
}
