package br.com.dio.lambda;

public class LambdaVsAnonima {
	
	public static void main(String[] args) {
		System.out.println("=== Início do teste ===");
		
		//Implemetação da classe anonima Runnable
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Classe anônima");
			}
		};
		
		Runnable r2 = () -> System.out.println("Lambda");
		
		r1.run();
		r2.run();
	}
}
