import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {

    public static void main(String[] args) {
        System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        // Read from "source.txt" and write to "destination.txt"
        FileReader reader = null;
        FileWriter writer = null;

        try {
            // Open the reader to read from "source.txt"
            reader = new FileReader("source.txt");

            // Open the writer to write to "destination.txt"
            writer = new FileWriter("destination.txt");

            int data;
            // Read characters from the input file and write to the output file
            while ((data = reader.read()) != -1) {
                writer.write(data);
            }

            System.out.println("Data successfully read from source.txt and written to destination.txt");
        } catch (IOException e) {
            // Handle any I/O exceptions
            e.printStackTrace();
        } finally {
            // Close the reader and writer
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
