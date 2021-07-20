package br.com.dio.aula04;

public class FatorialRecursivo {
	public static int fatorial(int v) {
		if (v == 1) {
			return v;
		}else {
			return v * fatorial((v - 1));
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(fatorial(5));
	}
}
