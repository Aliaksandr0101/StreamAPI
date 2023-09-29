package FilesWork;
import com.sun.source.tree.IfTree;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
        File file = new File("readme.txt");
        String str = "I love java";
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(str);
        fileWriter.close();
    }

}
