import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {

    public static void main(String[] args) {
        System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        // Create a BufferedReader to read from the console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            // Prompt the user for input
            System.out.println("Please enter some text:");
            
            // Read a line of text from the console
            String input = reader.readLine();
            
            // Check if input is null (end of stream)
            if (input == null) {
                System.err.println("No input provided. Exiting the program.");
                return;
            }
            
            // Print the input to the console
            System.out.println("You entered: " + input);
            
        } catch (IOException e) {
            // Handle any I/O exceptions
            System.err.println("An error occurred while reading input: " + e.getMessage());
            e.printStackTrace(System.err);
        } finally {
            // Close the BufferedReader
            try {
                reader.close();
            } catch (IOException e) {
                System.err.println("An error occurred while closing the reader: " + e.getMessage());
                e.printStackTrace(System.err);
            }
        }
    }
}
