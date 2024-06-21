import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Sackbahnhof {

  public static void rangieren(String dateiName) {

    int i = 0;

    Path dateiPfad = Path.of(dateiName);

    try (BufferedWriter out = Files.newBufferedWriter(dateiPfad)) {

      out.write(String.format("%2d: verschiebe Waggon Typ %c von Gleis %d nach %d%n", ++i, 'A', 1, 2));
      out.write(String.format("%2d: verschiebe Waggon Typ %c von Gleis %d nach %d%n", ++i, 'B', 1, 3));
      out.write(String.format("%2d: verschiebe Waggon Typ %c von Gleis %d nach %d%n", ++i, 'A', 2, 3));
      out.write(String.format("%2d: verschiebe Waggon Typ %c von Gleis %d nach %d%n", ++i, 'A', 1, 2));

    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
