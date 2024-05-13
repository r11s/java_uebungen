import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws Exception {

        String fileName = "./wav_files/10-MB-WAV.wav";

        Path path = Path.of(fileName);

        // Existiert die Datei
        System.out.printf("%n%n %s : %s%n", fileName, Files.exists(path) ? "existiert" : "nicht gefunden");

        // Open in Lesemodus
        RandomAccessFile fp = new RandomAccessFile(fileName, "r");

        fp.close();

    }
}
