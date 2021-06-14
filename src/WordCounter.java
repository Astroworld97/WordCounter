import java.io.*;
import java.util.Scanner;
//source: https://www.reddit.com/r/javaexamples/comments/344kch/reading_and_parsing_data_from_a_file/

public class WordCounter{
    Scanner scan;
    String filePath;
    File txtFile;
    FileReader fr;
    BufferedReader br;
    Dictionary dict;

    public WordCounter() throws FileNotFoundException, IOException {
        scan = new Scanner(System.in);
        filePath = askForFilePath();
        txtFile = new File(filePath);
        fr = new FileReader(txtFile);
        br = new BufferedReader(fr);
        dict = new Dictionary();
    }

    public String askForFilePath(){
        System.out.println("Please enter the filepath: ");
        return scan.nextLine();
    }

    public void readTxtFile(){
        try{
            String line = br.readLine();
            while(line!=null){
                // use string.split to load a string array with the values from each line of
                // the file, using a space as the delimiter
                String[] tokens = line.split(" ");
                for(String s: tokens){
                    dict.insert(s);
                }
                // read next line before looping
                // if end of file reached
                line = br.readLine();
            }
            // close file stream
            br.close();
        }catch(FileNotFoundException fnfe){
            System.out.println("file not found");
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }

    public void countedWords(){
        dict.printContents();
    }


}
