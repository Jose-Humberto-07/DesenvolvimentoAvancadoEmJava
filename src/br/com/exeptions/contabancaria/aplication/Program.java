package br.com.exeptions.contabancaria.aplication;

import java.util.Locale;
import java.util.Scanner;

import br.com.exeptions.contabancaria.entities.Account;
import br.com.exeptions.contabancaria.exeptions.BusinessException;

public class Program {

	public static void main(String[] args) {
		
		
		//Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account details");
		
		System.out.println("Number: ");
		int number = sc.nextInt();
		
		sc.nextLine();
		System.out.println("holder: ");
		String holder = sc.nextLine();
		
		System.out.println("opening balance: ");
		double balance = sc.nextDouble();
		
		System.out.println("withdrawal limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.println("Informe uma quantia para sacar: ");
		double amount = sc.nextDouble();
		
		try {
			acc.withdrawn(amount);
			System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
			
		} catch (BusinessException e) {
			System.out.println("ERROR: " + e.getMessage());
		}
		
		sc.close();

	}

}
