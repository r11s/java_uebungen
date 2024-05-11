import java.io.RandomAccessFile;

public class App {
  public static void main(String[] args) throws Exception {

    String fileName = "./music/FirstFluteSong.wav";

    RandomAccessFile f = new RandomAccessFile(fileName, "r");

    int i = 0;
    int x = f.read();

    while (i < 12 &&  x  != -1) {


      System.out.printf("%04d: %3d 0x%02x %2c %n",  i, x, x, x > 32 ? (char) x : '.');
      x = f.read();
      i++;
    }
    

    f.close();

    System.out.println("\nThat's all folk!");

    
  }
}
