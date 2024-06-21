import java.sql.Connection;
import java.sql.SQLException;
import java.util.Random;

import org.postgresql.Driver;

import werkzeuge.Terminal;

public class Main {

	public static void main(String[] args) {

		Random random = new Random(0);
		
		int zufall = random.nextInt(6);
		
		System.out.println(zufall);
		zufall = random.nextInt(6);
		
		System.out.println(zufall);

		System.out.print("Eingabe: ");
		String s = Terminal.readString();

		System.out.println(s);

		Driver driver = new Driver();

		try {
			Connection pg = driver.connect("", null);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
