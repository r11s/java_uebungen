import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        Game game;

        Random random = new Random();

        // Players
        int anzahlPlayers = random.nextInt(8) + 2;
        Player[] players = new Player[anzahlPlayers];

        for (int i = 0; i < players.length; i++) {
            // Cities
            int anzahlCities = random.nextInt(6);
            City[] cities = new City[anzahlCities];

            for (int j = 0; j < cities.length; j++) {

                int gold = random.nextInt(100);
                int food = random.nextInt(1000);
                int year = random.nextInt(1000) + 1000;

                cities[j] = new City(year, food, gold);

            }

            players[i] = new Player("Spieler " + i, cities);
        }

        game = new Game(players);

        printPlayers(game.getPlayers());

        System.out.println(game.getRichest());

    }

    static void printPlayers(Player[] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
            printCities(players[i].getCities());
        }
    }

    static void printCities(City[] cities) {
        for (int i = 0; i < cities.length; i++) {
            System.out.print("    " + i + " ");
            System.out.print(", Year: " + cities[i].getYear() + " ");
            System.out.print(", Gold: " + cities[i].getPower().getGold() + " ");
            System.out.println(", Food: " + cities[i].getPower().getFood() + " ");
        }
        System.out.println();
    }
}
