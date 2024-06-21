import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws Exception {

        Path p1 = Path.of("C:", "temp", "demo1.txt");

        System.out.println(p1);
        System.out.println(p1.getFileName());
        System.out.println(p1.toAbsolutePath());
        System.out.println(p1.getFileSystem());
        System.out.println(p1.resolve(p1));

    }

}
