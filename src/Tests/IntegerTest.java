package Tests;

public class IntegerTest {
    public static void main(String[] args) {
        Integer x = new Integer(3);
        int y = x.intValue();
        System.out.println(y);
        Integer a = new Integer(6);
        int b = (int) a;
        System.out.println(b);
    }
}
