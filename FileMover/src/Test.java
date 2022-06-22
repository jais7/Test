import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Scanner;

public class Test extends ReadFile{

    public void read(){
        ReadFile readFile = new ReadFile();
        readFile.ReadFromFile();
        ArrayList<String> stringArrayList;
        stringArrayList = readFile.arrayList;
        System.out.println(stringArrayList);

        try {
            String fromFile = "";
            String toFile = "";
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the filepath of the source file: ");
            String ansOne = scanner.nextLine();
            System.out.println("Enter the filepath for dest file: ");
            String ansTwo = scanner.nextLine();
            Path source;
            Path target;
            for (int i = 0; i < stringArrayList.size(); i++) {
                fromFile = ansOne + "\\" + stringArrayList.get(i) + ".txt";
                toFile = ansTwo + "\\" + stringArrayList.get(i) + ".txt";

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
