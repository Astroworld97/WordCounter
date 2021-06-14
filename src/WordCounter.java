import java.io.*;
import java.util.*;
//source: https://www.reddit.com/r/javaexamples/comments/344kch/reading_and_parsing_data_from_a_file/

public class WordCounter{
    Scanner scan;
    String filePath;
    File txtFile;
    FileReader fr;
    BufferedReader br;
    HashMap<String, Integer> dict;

    public WordCounter() throws FileNotFoundException, IOException {
        scan = new Scanner(System.in);
        filePath = askForFilePath();
        txtFile = new File(filePath);
        fr = new FileReader(txtFile);
        br = new BufferedReader(fr);
        dict = new HashMap<String, Integer>();
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
                    s = s.toLowerCase();
                    insert(s);
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

    public void dictLength(){
        System.out.println(dict.size());
    }

    public void insert(String key) {
        if(dict.containsKey(key)){
            int oldAmount = dict.get(key); //gets the counted amount currently in the dictionary for this word
            dict.replace(key, oldAmount+1);
        }else{
            dict.put(key, 1);
        }

    }

    public void printContents() {
        if(dict.isEmpty()){
            System.out.println("Dictionary is empty!");
        }else {
            Set list = dict.entrySet();
            Iterator<Map.Entry<String, Integer>> it = list.iterator();

            while (it.hasNext()) {
                Map.Entry<String, Integer> entry = it.next();
                System.out.println("Word: '" + entry.getKey() + "' Amount in text: " + entry.getValue());
            }
        }
    }
}
