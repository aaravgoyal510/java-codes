import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedWriterExample {

    public static void main(String[] args) {
        System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        // Create a BufferedReader to read from the console
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter fileWriter = null;

        try {
            // Prompt the user for input
            System.out.println("Please enter some text (type 'exit' to finish):");

            // Open BufferedWriter to write to "output.txt"
            fileWriter = new BufferedWriter(new FileWriter("writtentrhughBuffered.txt"));

            String input;
            while ((input = consoleReader.readLine()) != null) {
                // Exit the loop if the user types 'exit'
                if ("exit".equalsIgnoreCase(input)) {
                    break;
                }

                // Write the input to the file
                fileWriter.write(input);
                fileWriter.newLine();  // Add a new line
            }

            System.out.println("Data successfully written to WtittenthroughBuffered.txt");
        } catch (IOException e) {
            // Handle any I/O exceptions
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace(System.err);
        } finally {
            // Close the BufferedReader and BufferedWriter
            try {
                if (consoleReader != null) {
                    consoleReader.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.err.println("An error occurred while closing the streams: " + e.getMessage());
                e.printStackTrace(System.err);
            }
        }
    }
}
