public class IanDictTest {
    public static void main(String[] args) {
        Dictionary d = new Dictionary();

        String s = "Hamilton";
        int x = 3;

        System.out.println(d.isEmpty());
        System.out.println(d.size());
        d.printContents();
        d.insert(s);
        System.out.println(d.isEmpty());
        System.out.println(d.size());
        d.printContents();
        d.remove(s);
        System.out.println(d.isEmpty());
        System.out.println(d.size());
        d.printContents();
    }
}
