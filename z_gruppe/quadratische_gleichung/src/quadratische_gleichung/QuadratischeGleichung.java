package quadratische_gleichung;

import java.util.Scanner;

public class QuadratischeGleichung {
	static Scanner eingabe = new Scanner(System.in);

	public static void main(String[] args) {
		

		// Variablen einlesen
		System.out.print("Variablen a eingeben: ");
		double a = eingabe.nextDouble();
		System.out.print("Variablen b eingeben: ");
		double b = eingabe.nextDouble();
		System.out.print("Variablen c eingeben: ");
		double c = eingabe.nextDouble();
		System.out.printf("a, b, c = %.12f, %.12f, %.12f%n", a, b, c);

		// d berechnen
		double d = b * b - 4 * a * c;
		System.out.printf("d = %.15f%n", d);
		System.out.println("d == 0: " + (d == 0));

		String resultat = "";
		double x_1;
		double x_2;
		double epsilon = 1e-12;
		System.out.printf("epsilon = %.15f%n", epsilon);

		if (-epsilon < d && d < epsilon) {
			resultat = "Diese Gleichung hat hat eine Lösung:";
			x_1 = -b / (2 * a);
			resultat += String.format("%nx1 = %.10f", x_1);

		} else if (d < 0) {
			resultat = "Diese Gleichung hat hat keine Lösung!";

		} else if (d > 0) {
			resultat = "Diese Gleichung hat hat zwei Lösungen:";
			double w = Math.sqrt(d);
			x_1 = (-b - w) / (2 * a);
			x_2 = (-b + w) / (2 * a);
			resultat += String.format("%nx1 = %.10f", x_1);
			resultat += String.format(", x2 = %.10f", x_2);
		}

		System.out.println(resultat);
	}
}