import java.io.RandomAccessFile;

public class Main {
  public static void main(String[] args) throws Exception {

    String fileName = "./wav_testfiles/1-MB-WAV.wav";

    RandomAccessFile f = new RandomAccessFile(fileName, "r");

    System.out.printf("%d %x%n", f.length(), f.length() - 8);

    int i = 0;

    int x = f.read();

    while (i < 12 && x != -1) {

      System.out.printf("%04d: %3d 0x%02x %2c %n", i, x, x, x > 32 ? (char) x : '.');
      x = f.read();
      i++;
    }

    f.close();

    System.out.println("\nThat's all folk!");

  }
}
