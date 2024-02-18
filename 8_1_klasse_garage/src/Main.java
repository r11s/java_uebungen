
public class Main {

	public static void main(String[] args) {
		
		

		f(42);

		Garage blaueGarage = new Garage();
		Garage grueneGarage = new Garage();
		Garage roteGarage = new Garage();

		System.out.println(blaueGarage);

		Garage garage = new Garage(20); // Garage mit 20 Parkplaetzen

		System.out.println(garage);

		Garage kopie = new Garage(blaueGarage);

		System.out.println(kopie);

		int kapazitaet = garage.getKapazitaet();

		System.out.println(kapazitaet);
		System.out.println(garage.getKapazitaet());

		kapazitaet = blaueGarage.getKapazitaet();

		System.out.println(kapazitaet);

		Garage b = garage;
		System.out.println(b);

		int i = 0;
		try {

			b.driveIn();
			System.out.println(++i);
			b.driveIn();
			System.out.println(++i);
			b.driveIn();
			System.out.println(++i);
			b.driveIn();
			System.out.println(++i);
			b.driveIn();
			System.out.println(++i);
//			b.driveOut();
//			System.out.println(++i);
//			b.driveOut();
//			System.out.println(++i);
//			b.driveOut();
//			System.out.println(++i);
//			b.driveOut();
//			System.out.println(++i);
//			b.driveOut();
//			System.out.println(++i);
//			b.driveOut();
//			System.out.println(++i);
//			b.driveOut();
//			System.out.println(++i);
			b.driveIn();
			System.out.println(++i);
			b.driveIn();
			System.out.println(++i);
			b.driveIn();
			System.out.println(++i);
			b.driveIn();
			System.out.println(++i);
			b.driveIn();
			System.out.println(++i);
			b.driveIn();
			System.out.println(++i);
			b.driveOut();
			System.out.println(++i);
			b.driveIn();
			System.out.println(++i);
			b.driveIn();
			System.out.println(++i);
			b.driveOut();
			System.out.println(++i);
			b.driveIn();
			System.out.println(++i);

			for (int n = i + 3 ; i < n; i++) {
				b.driveIn();
				System.out.println(++i + " " + n);
			}

				

			b.driveOut();
			System.out.println(++i);
			b.driveOut();
			System.out.println(++i);
			b.driveOut();
			System.out.println(++i);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		} finally {
			System.out.println("Aufräumen.");
		}

		System.out.println("Es geht weiter");
		
		System.out.println(grueneGarage);
		
		
		Garage g2 = new Garage(33);
		System.out.println(g2);
		

	}

	public static void f(int x) {
		System.out.println(x);
	}

}
