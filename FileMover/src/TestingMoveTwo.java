import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

public class TestingMoveTwo {
    public void move() {


        ArrayList<String> my = new ArrayList<>();

        my.add("One");
        my.add("Two");


        try {

            String fromFile = "";
            String toFile = "";
            Path source;
            Path target;
            for (int i = 0; i < my.size(); i++) {
                fromFile = "C:\\Users\\jai7j\\OneDrive\\Desktop\\Folder 1\\" + my.get(i) + ".txt";
                toFile = "C:\\Users\\jai7j\\OneDrive\\Desktop\\Folder 2\\" + my.get(i) + ".txt";

                source = Paths.get(fromFile);
                target = Paths.get(toFile);
                Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

//                System.out.println(Paths.get(fromFile));
                System.out.println("This file has been moved: " + source);

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
