import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        Random r = new Random();

        Katze schnurrli = new Katze();
        Ente dagobert = new Ente();

        schnurrli.geraeusch();

        dagobert.geraeusch();

        dagobert.hallo();

        System.out.println(schnurrli.getClass());

    }
}
