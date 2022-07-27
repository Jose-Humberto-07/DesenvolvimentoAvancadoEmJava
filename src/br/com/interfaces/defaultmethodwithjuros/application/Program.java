package br.com.interfaces.defaultmethodwithjuros.application;

import java.util.Locale;
import java.util.Scanner;

import br.com.interfaces.defaultmethodwithjuros.services.BrazilTaxService;
import br.com.interfaces.defaultmethodwithjuros.services.InterestService;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Amount: ");
		double amount = sc.nextDouble();
		System.out.println("Months: ");
		int months = sc.nextInt();
		
		InterestService is = new BrazilTaxService(2.0);
		double payment = is.payment(amount, months);
		
		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));
		
		sc.close();
		
	}
}
