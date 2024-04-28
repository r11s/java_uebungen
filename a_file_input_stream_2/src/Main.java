import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {

        /*
         * String dateiName = Path.of(".", "data",
         * "abc.txt").toAbsolutePath().toString();
         */

        String dateiName = "./data/abc.txt";
        // dateiName = "C:/Program Files/Vim/vim91/libintl-8.dll";

        InputStream in = null;

        try {
            in = new BufferedInputStream(new FileInputStream(dateiName)); // Datei wird geöffnet

            System.out.println("Datei geöffnet");

            boolean dateiEnde = false;

            while (!dateiEnde) {
                int gelesenesByte = in.read(); // Zeichen aus der Datei lesen

                if (gelesenesByte == -1) {
                    dateiEnde = true;
                } else {
                    System.out.printf("%c", gelesenesByte);
                }

            }

        } catch (IOException e) { // Wenn ein Fehler auftritt

            System.err.println(e.getMessage());

        }

        try {
            if (in != null) {
                in.close();
                System.out.println("Datei geschlossen.");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

}
