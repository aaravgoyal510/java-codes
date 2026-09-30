import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("First");
        set.add("Second");
        set.add("Third");

        for (String value : set) {
            System.out.println(value);
        }
    }
}
