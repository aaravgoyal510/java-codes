import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {

    public static void main(String[] args) {
        System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        Person person = null;

        try (FileInputStream fileIn = new FileInputStream("myfile.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            person = (Person) in.readObject();
            System.out.println("Deserialized Person:");
            System.out.println(person);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
