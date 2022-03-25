package br.com.exeptions.solucaoruim.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import br.com.exeptions.solucaoruim.model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter with number Room: ");
		int number = sc.nextInt();
		
		System.out.println("Enter with check-In date (dd/MM/yyyy)");
		Date checkIn = sdf.parse(sc.next());
		
		System.out.println("Enter with check-Out date (dd/MM/yyyy)");
		Date checkOut = sdf.parse(sc.next());
		
		if (!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		} else {
			Reservation reservetion = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservetion);
			
			
			System.out.println();
			System.out.println("Enter with number Room: ");
			number = sc.nextInt();
			
			System.out.println("Enter with check-In date (dd/MM/yyyy)");
			checkIn = sdf.parse(sc.next());
			
			System.out.println("Enter with check-Out date (dd/MM/yyyy)");
			checkOut = sdf.parse(sc.next());
			
			Date now = new Date();
			if (checkIn.before(now) || checkOut.before(now)) {
				System.out.println("Error in reservation: Reservation dates for update must be future dates");
			} else if (!checkOut.after(checkIn)) {
				System.out.println("Error in reservation: Check-out date must be after check-in date");
			} else {
				reservetion.updates(checkIn, checkOut);
				System.out.println("Reservation: " + reservetion);
			}
		}
		
		
		
		sc.close();
	}

}
