package Tests;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        String first = "hello";
        arr.add(first);
        System.out.println(arr.size());
        String second = "World";
        arr.add(second);
        System.out.println(arr.size());
        arr.remove(0);
        System.out.println(arr.size());
        arr.remove(0);
        System.out.println(arr.size());


    }
}
