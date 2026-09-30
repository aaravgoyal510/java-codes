import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {

    public static void main(String[] args) {
        System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        OutputStream outputStream = null;
        try {
            // Open the output stream to the file "output.txt"
            outputStream = new FileOutputStream("output.txt");
            
            // Sample text to write to the file
            String sampleText = "Hello everybody we are learning Input Output in Java.\n"
                              + "This program is used for demonstrating OutputStream of FileStream Typein Java.\n"
			      + "We find here writning text is very easy in Java.\n"
;
            
            // Convert the string to bytes
            byte[] data = sampleText.getBytes();
            
            // Write data to the file
            outputStream.write(data);
            
            // Flush the output stream to ensure all data is written
            outputStream.flush();
            
            System.out.println("Data successfully written to output.txt");
        } catch (IOException e) {
            // Handle any I/O exceptions
            e.printStackTrace();
        } finally {
            // Close the output stream
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
