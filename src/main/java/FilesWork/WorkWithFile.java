package FilesWork;
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
    }

}
