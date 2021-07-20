package br.com.dio.lambda;

public class LambdaVsAnonima {
	
	public static void main(String[] args) {
		System.out.println("=== In�cio do teste ===");
		
		//Implemeta��o da classe anonima Runnable
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Classe an�nima");
			}
		};
		
		Runnable r2 = () -> System.out.println("Lambda");
		
		r1.run();
		r2.run();
	}
}
