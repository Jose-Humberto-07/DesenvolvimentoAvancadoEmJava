package br.com.dio.lambda;

import java.util.ArrayList;

public class InterfaceFuncional {
	
	interface Num {
		double getValue();
	}
	
	interface ValorNumerico {
		boolean teste(int n);
	}
	
	interface Par {
		String saberPar(int num);
	}
	
	public static void main(String[] args) {
		Num numero = () -> 777.77; 
		System.out.println(numero.getValue());
		
		Num numero2 = () -> Math.random() * 100;
		System.out.println(numero2.getValue());
		
		
		
		
	
		
	

	}
}
