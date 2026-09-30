import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("One"); // Duplicate element

        for (String value : set) {
            System.out.println(value);
        }
    }
}
