import java.io.RandomAccessFile;

public class Main {
  public static void main(String[] args) throws Exception {

    // Dateiformat: RIFF....WAVE....
    // 0123456789..
    String fileName = "./wav_testfiles/1-MB-WAV.wav";

    RandomAccessFile f = new RandomAccessFile(fileName, "r");

    f.seek(0); // Position = 0

    System.out.printf("%d %xd %x%n", f.length(), f.length(), f.length() - 8);

    int i = 0;

    int x; // wird als Zahl ohne Vorzeichen verwendet

    x = f.read(); // Liest Position 0 und Position wird um 1 erhoeht, d.h. Position = 1

    while (i < 12 && x != -1) {

      System.out.printf("%4d: %3d 0x%02x %2c %s%n", i, x, x, x > 32 ? (char) x : '.', Integer.toBinaryString(x));

      x = f.read(); // jedesmal wird die Position um 1 ehoeht
      i++;
    }

    // Position = 12

    f.seek(8); // setze File Handler auf die 8 Position in der Datei

    for (int j = 0; j < 4; j++) {
      int z = f.read();
      System.out.printf("%x ", z);
    }
    System.out.println();

    f.seek(4); // setze File Handler auf die 8 Position in der Datei

    for (int j = 0; j < 4; j++) {
      int z = f.read();

      System.out.printf("%02x ", z);

    }

    f.seek(4);

    System.out.println();

    for (int j = 0; j < 4; j++) {
      int z = f.read();

      System.out.printf("%2d ", z);

    }
    System.out.println();

    f.close();

  }
}
