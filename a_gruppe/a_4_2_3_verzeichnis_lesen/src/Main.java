import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Path> dateiliste;
        try {
            dateiliste = Files.walk(Path.of(".")).toList();

            for (Path path : dateiliste) {
                System.out.println(path);
            }

            for (Path path : dateiliste) {
                System.out.println(path.toAbsolutePath());
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());

        }

    }
}
