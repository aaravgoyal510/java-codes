import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        Vector<String> vector = new Vector<>();
        vector.add("Red");
        vector.add("Green");
        vector.add("Blue");

        for (String color : vector) {
            System.out.println(color);
        }
    }
}
