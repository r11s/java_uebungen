import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class DirectoryTree {

  public static void printDirectoryTree(String dirName) {

    List<Path> plist = null;

    try {
      plist = Files.walk(Path.of(dirName)).toList();

      for (Path p : plist) {

        if (Files.isDirectory(p)) {
          System.out.println(p.toAbsolutePath().toString());
        }

      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }

}
