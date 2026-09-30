import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        LinkedList<String> list = new LinkedList<>();
        list.add("Dog");
        list.add("Cat");
        list.add("Cow");

        for (String animal : list) {
            System.out.println(animal);
        }
    }
}
