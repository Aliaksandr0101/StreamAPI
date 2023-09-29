package FilesWork;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class WorkWithFile {
    public static void main(String[] args) throws IOException {
        if (!(Files.exists(Path.of("Readme.txt")))) {
            Files.createFile(Path.of("Readme.txt"));
        }

        if ((Files.exists(Path.of("Readme.txt")))){
            Files.delete(Path.of("Readme.txt"));
        }

        if (!(Files.exists(Path.of("Readme.txt")))) {
            Files.createFile(Path.of("Readme.txt"));
        }
        File file = new File("Readme.txt");
        String str = "I love java";
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(str);
        fileWriter.close();

        FileReader fileReader = new FileReader("Readme.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String text;
        while ((text = bufferedReader.readLine()) != null) {
            System.out.println(text);
        }
    }

}
