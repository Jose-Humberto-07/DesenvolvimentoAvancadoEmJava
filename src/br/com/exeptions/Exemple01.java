package br.com.exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

public class Exemple01 {

	public static void main(String[] args) {
		
		try {
			Scanner teclado = new Scanner(System.in);
			
			String[] vector = teclado.nextLine().split(" ");
			
			int position = teclado.nextInt();
			
			System.out.println(vector[position]);
			
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		
		System.out.println("End of program");
		

	}

}
