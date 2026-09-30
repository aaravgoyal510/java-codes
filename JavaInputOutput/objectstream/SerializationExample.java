import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {

    public static void main(String[] args) {
        System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        Person person = new Person("Ankit", 25);

        try (FileOutputStream fileOut = new FileOutputStream("myfile.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(person);
            System.out.println("Serialized data is saved in myfile.ser");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
