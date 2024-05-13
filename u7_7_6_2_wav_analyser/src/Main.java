import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

  public static void main(String[] args) throws Exception {

    // f.seek(0); // Hier Position = 0
    // System.out.println(f.getFilePointer()); // Position in der Datei ausgeben

    String fileName = "./wav_testfiles/1-MB-WAV.wav";

    Path path = Path.of(fileName);

    // Teil 1
    System.out.printf("%n%n %s : %s%n", fileName, Files.exists(path) ? "existiert" : "nicht gefunden");

    RandomAccessFile fp = new RandomAccessFile(fileName, "r");

    // Teil 2
    byte[] riffChunk = new byte[4]; // Array deklarieren

    fp.read(riffChunk); // Bytes in Array einlesen; gibt die Anzahl eingelesenen Bytes zurueck

    String sRiffChunk = "";

    for (int i = 0; i < riffChunk.length; i++) {
      sRiffChunk += (char) riffChunk[i];
    }

    System.out.printf("RIFF-Chunk : Format ist %s%n", sRiffChunk.equals("RIFF") ? "OK" : "NOT OK");

    System.out.println("------------------------------------------------");

    // Teil 3

    byte[] formatChunk = new byte[24];

    fp.seek(12);
    fp.read(formatChunk);

    fp.close();

    // bytes / frame
    System.out.print("Bytes /  Frame : ");
    for (int i = 20; i < 22; i++) {
      System.out.printf("%d ", (int) formatChunk[i]);
    }
    System.out.println();

    // Quantisierung
    System.out.print("Quantisierung : ");
    for (int i = 22; i < 24; i++) {
      System.out.printf("%d ", (int) formatChunk[i]);
    }
    System.out.println();

    // Format Chunk Id
    for (int i = 0; i < 4; i++) {
      System.out.printf("%c", (char) formatChunk[i]);
    }
    System.out.println();

    // Chunk Groesse
    for (int i = 4; i < 8; i++) {
      System.out.printf("%d ", (int) formatChunk[i]);
    }
    System.out.println();

    // Audio Format
    for (int i = 8; i < 10; i++) {
      System.out.printf("%d ", (int) formatChunk[i]);
    }
    System.out.println();

    // Kanaele Format
    for (int i = 10; i < 12; i++) {
      System.out.printf("%d ", formatChunk[i]);
    }
    System.out.println();

    // Sampling Rate
    String h = "";

    for (int i = 15; i > 11; i--) {
      String t = String.format("%02x", formatChunk[i] < 0 ? formatChunk[i] + 128 : formatChunk[i]);
      System.out.printf("%s ", t);
      h += t;
    }
    System.out.println();
    System.out.println(h);
    System.out.println(Integer.parseInt(h, 16));

    System.out.println();

    // Byte Rate
    h = "";

    for (int i = 19; i > 15; i--) {
      String t = String.format("%02x", formatChunk[i] < 0 ? formatChunk[i] + 128 : formatChunk[i]);
      System.out.printf("%s ", t);
      h += t;
    }
    System.out.println();
    System.out.println(h);
    System.out.println(Integer.parseInt(h, 16));

    System.out.println();

  }
}
