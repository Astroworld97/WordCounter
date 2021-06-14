import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        WordCounter w = new WordCounter();
        w.readTxtFile();
        w.printContents();
    }
}
