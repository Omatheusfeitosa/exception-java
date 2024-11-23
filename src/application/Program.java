package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room Number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date (DD/MM/YYYY):");
		Date checkin = sdf.parse(sc.next());
		System.out.print("Check-out date (DD/MM/YYYY):");
		Date checkout = sdf.parse(sc.next());
		
		if(!checkout.after(checkin)) {
			System.out.print("Checkout must be after the checkin!");
		} else {
			Reservation reservation = new Reservation(number, checkin, checkout);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter de data to update de reservation");
			System.out.print("Check-in date (DD/MM/YYYY):");
			checkin = sdf.parse(sc.next());
			System.out.print("Check-out date (DD/MM/YYYY):");
			checkout = sdf.parse(sc.next());
			
			Date now = new Date();
			if(checkout.before(now) || checkin.before(now)) {
				System.out.print("Error in reservation: reservation date must be in the future");
			} else if(!checkout.after(checkin)) {
				System.out.print("Checkout must be after the checkin!");
			} else {
				reservation.updateDates(checkin, checkout);
				System.out.print("Reservation: " + reservation);
			}	
		}
		
		sc.close();
		
	}

}
