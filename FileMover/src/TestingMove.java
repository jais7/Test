import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestingMove {
    public void move() {
        String fromFile = "C:\\Users\\jai7j\\OneDrive\\Desktop\\Folder 1\\Three.txt";
        String toFile = "C:\\Users\\jai7j\\OneDrive\\Desktop\\Folder 2\\Three.txt";

        Path source = Paths.get(fromFile);
        Path target = Paths.get(toFile);

        try {

            // rename or move a file to other path
            // if target exists, throws FileAlreadyExistsException
            Files.move(source, target);
            // if target exists, replace it.
            // Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);

            // multiple CopyOption
            /*CopyOption[] options = { StandardCopyOption.REPLACE_EXISTING,
                                StandardCopyOption.COPY_ATTRIBUTES,
                                LinkOption.NOFOLLOW_LINKS };

            Files.move(source, target, options);*/

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
