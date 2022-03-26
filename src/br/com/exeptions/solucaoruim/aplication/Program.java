package br.com.exeptions.solucaoruim.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import br.com.exeptions.solucaoruim.model.entities.Reservation;
import br.com.exeptions.solucaoruim.model.exceptions.DomainExecption;

public class Program {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			// recebe dados
			System.out.println("Enter with number Room: ");
			int number = sc.nextInt();

			System.out.println("Enter with check-In date (dd/MM/yyyy)");
			Date checkIn = sdf.parse(sc.next());

			System.out.println("Enter with check-Out date (dd/MM/yyyy)");
			Date checkOut = sdf.parse(sc.next());

			
			// atualiza os dados
			Reservation reservetion = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservetion);

			System.out.println();
			System.out.println("Enter with data to update the reservation: ");
			

			System.out.println("Enter with check-In date (dd/MM/yyyy)");
			checkIn = sdf.parse(sc.next());

			System.out.println("Enter with check-Out date (dd/MM/yyyy)");
			checkOut = sdf.parse(sc.next());

			String error = reservetion.updateDates(checkIn, checkOut);
			
			System.out.println("Reservation: " + reservetion);

		} catch (ParseException e) {
			System.out.println("Invalidate date format");
		} catch (DomainExecption e) {
			System.out.println("Error in reservation: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error: " + e.getMessage());
		}
		
		
		
		
		//sc.close();
	}

}
