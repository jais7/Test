import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    ArrayList<String> arrayList = new ArrayList<>();

    public List<String> ReadFromFile() {
    try
    {
        File file=new File("C:\\Users\\jai7j\\OneDrive\\Desktop\\Folder 2\\movethesefiles.txt");    //creates a new file instance
        FileReader fr=new FileReader(file);   //reads the file
        BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream
        String line;
        while((line=br.readLine())!=null)
        {

            arrayList.add(line);
//            sb.append(line);      //appends line to string buffer
//            sb.append("\n");     //line feed
        }
        fr.close();    //closes the stream and release the resources
//        System.out.println("Contents of File: ");
//        System.out.println(sb);   //returns a string that textually represents the object
        return arrayList;
    }
    catch(IOException e)
    {
        e.printStackTrace();
    }
        return null;
    }
}
