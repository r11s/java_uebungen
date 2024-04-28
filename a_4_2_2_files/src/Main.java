
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Files!");

        Path path = Path.of("abc.txt");

        System.out.println("Existiert abc.txt: " + Files.exists(path));

        if (!Files.exists(path)) { // ! ist not
            Files.createFile(path);
        }
        System.out.println("Existiert abc.txt: " + Files.exists(path));

        if (Files.exists(path)) {
            Files.delete(path);
        }
        System.out.println("Existiert abc.txt: " + Files.exists(path));

        Path tempDatei = Files.createTempFile(Path.of("."), "quark", "kuchen");

        Path xy = Files.createTempFile(Path.of("."), "quark", "kuchen");

        Files.deleteIfExists(Path.of("was.txt"));

        Path neueDatei = Path.of("was.txt");

        Files.move(tempDatei, neueDatei);

        if (Files.exists(Path.of("temp"))) {
            Files.delete(Path.of("temp"));
        }

        Files.createDirectories(Path.of("temp"));

        System.out.println("Verzeichnis temp");
        System.out.println(Files.exists(Path.of("temp")));
        System.out.println(Files.isDirectory(Path.of("temp")));
        System.out.println(Files.isExecutable(Path.of("temp")));
        System.out.println(Files.isWritable(Path.of("temp")));

        System.out.println("\nDatei was.txt");
        System.out.println(Files.exists(Path.of("was.txt")));
        System.out.println(Files.isDirectory(Path.of("was.txt")));
        System.out.println(Files.isExecutable(Path.of("was.txt")));
        System.out.println(Files.isWritable(Path.of("was.txt")));
    }

}
