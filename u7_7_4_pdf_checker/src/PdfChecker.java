import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class PdfChecker {

  public static void reportPdfsMitSuffix(String dirName) {

    Path path = Path.of(dirName);

    try {
      List<Path> paths = Files.walk(path, 1).toList();

      for (Path p : paths) {

        if(Files.isDirectory(p)){
          continue;
        }

        if (p.toString().endsWith(".pdf")) {
          System.out.println(p.toString() + " ist PDF");

        } else {
          System.out.println(p.toString() + " ist kein PDF");
        }

      }

    } catch (IOException e) {
      System.out.println(e.getMessage());
      ;
    }

  }

  public static void reportPdfsMitTyp(String dirName) {

    Path path = Path.of(dirName);

    try {
      List<Path> paths = Files.walk(path, 1).toList();

      for (Path p : paths) {

        if(Files.isDirectory(p)){
          continue;
        }
        
        if (isPdf(p)) {
          System.out.println(p.toString() + " ist PDF");
        } else {
          System.out.println(p.toString() + " ist kein PDF");
        }

      }

    } catch (IOException e) {
      System.out.println(e.getMessage());
      ;
    }

  }

  private static boolean isPdf(Path file) {

    final String PDF_FILE = "255044462d"; // 0x25 0x50 0x44 0x46 0x2D
    StringBuilder checkString = new StringBuilder("");

    try (InputStream in = Files.newInputStream(file)) {

      int i = 0;
      int c = in.read();

      while (c != -1 && i < 5) {
        checkString.append(Integer.toHexString(c));
        c = in.read();
        i++;
      }

    } catch (IOException e) {
      System.out.println("FEHLER: " + e.getMessage());
      ;
    }

    // System.out.println(PDF_FILE);
    // System.out.println(checkString.toString());

    return PDF_FILE.equals(checkString.toString());
  }

}
