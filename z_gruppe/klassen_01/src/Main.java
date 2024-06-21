
import java.util.Scanner;

import paket1.Ticketautomat;


class Main { 
	
	Scanner eingabe = new Scanner(System.in);
	
	
	// Die Main-Methode ist der Einstieg in ein Java-Programm
	public static void main(String[] args) {
		
		
		Ticketautomat ticketBasel = new Ticketautomat(28); // neuer Automat mit Ticketpreis
		Ticketautomat ticketAarau = new Ticketautomat(12);
				
		System.out.println(ticketBasel); // Gibt Id des Objektes TicketBasel zurück.
		System.out.println(ticketAarau);

		System.out.print("Basel bereits bezahlt: ");
		System.out.println(ticketBasel.gibBisherGezahltenBetrag());

		System.out.print("Aarau bereits bezahlt: ");
		System.out.println(ticketAarau.gibBisherGezahltenBetrag());
		
		System.out.println("20 für Basel einwerfen.");
		ticketBasel.geldEinwerfen(20);

		System.out.print("Basel bereits bezahlt: ");
		System.out.println(ticketBasel.gibBisherGezahltenBetrag());

		System.out.print("Aarau bereits bezahlt: ");
		System.out.println(ticketAarau.gibBisherGezahltenBetrag());
		
		System.out.println("20 für Basel einwerfen.");
		ticketBasel.geldEinwerfen(20);

		System.out.print("Basel bereits bezahlt: ");
		System.out.println(ticketBasel.gibBisherGezahltenBetrag());

		System.out.print("Aarau bereits bezahlt: ");
		System.out.println(ticketAarau.gibBisherGezahltenBetrag());

		ticketBasel.ticketDrucken();
		
		ticketAarau.ticketDrucken();
		
	}

}
