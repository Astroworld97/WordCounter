import java.util.*;
import java.lang.Integer;
//source: https://stackoverflow.com/questions/4579683/implement-dictionary-using-java

public class Dictionary {

    private ArrayList<Entry> list;

    public Dictionary() {
        this.list = new ArrayList<Entry>();
    }

    /**
     * find(k): if the dictionary has an entry with key k, return it, else, returns null
     */
    //Ojo: 1. Iterator can traverse only in forward direction whereas ListIterator traverses both in forward and backward directions
    //2. ListIterator can help to replace an element whereas Iterator cannot.
    //source: https://www.geeksforgeeks.org/difference-between-an-iterator-and-listiterator-in-java/
    public Entry find(String key) {
        // for all entries in set...
        //   check if key matches
        //     - if it does then return it
        Iterator<Entry> it = list.iterator();
        while(it.hasNext()){
            Entry curr = it.next();
            if(key.equals(curr.key)){
                return curr;
            }
        }
        // else
        return null;
    }

    /**
     * findAll(k): returns a list of all entries with key k
     * @return
     */
    public ArrayList<Entry> findAll(String key) {
        // make a temporary list
        // for all entries in set...
        //   check if key matches
        //     - if it does then add it to temporary list
        ArrayList<Entry> arr = new ArrayList<>();
        Iterator<Entry> it = list.iterator();
        while(it.hasNext()){
            Entry curr = it.next();
            if(key.equals(curr.key)){
                arr.add(curr);
            }
        }
        // return the temporary list
        return arr;
    }

    /**
     * Inserts the word with the correct amount found into the
     */
    public void insert(String key) {
        key = key.toLowerCase();
        Entry toAdd = new Entry(key, 1);

        if(list.contains(toAdd)){
            for(int i = 0; i<list.size(); i++){
                if(list.get(i).getKey().equals(toAdd.getKey())) {
                    list.set(i, new Entry(key, new Integer(list.get(i).getValue()+1)));
                    break;
                }
            }
        }else{
            list.add(toAdd);
        }

    }

    /**
     * remove(e): remove the entry e from the dictionary
     */
    public void remove(String key) {
        for(int i = 0; i<list.size(); i++) {
            if(list.get(i).getKey().equals(key)){
                list.remove(i);
            }
        }
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public void printContents() {
        if(list.isEmpty()){
            System.out.println("Dictionary is empty!");
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Word: '" + list.get(i).getKey() + "' Amount in text: " + list.get(i).getValue());
        }
    }

}