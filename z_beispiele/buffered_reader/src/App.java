import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) throws Exception {

        ioBeispiel();

        nioBeispiel();

    }

    private static void nioBeispiel() {

        Path path = Paths.get("demo.txt");

        try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {

            String text;

            while ((text = bufferedReader.readLine()) != null) {
                System.out.println("nio > " + text);
            }

        } catch (

        IOException e) {
            System.err.println(e.getLocalizedMessage());
        }
    }

    private static void ioBeispiel() {

        File file = new File("demo.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            String text;

            while ((text = bufferedReader.readLine()) != null) {
                System.out.println("io > " + text);
            }

        } catch (

        IOException e) {
            System.err.println(e.getLocalizedMessage());
        }
    }
}
