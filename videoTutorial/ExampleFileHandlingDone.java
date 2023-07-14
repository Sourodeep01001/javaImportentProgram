package videoTutorial;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExampleFileHandlingDone {

    public static void main(String[] args) {
        String filename = "example.txt";

        // Write to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Hello, World!");
            writer.newLine();
            writer.write("This is an example of file handling in Java.");
            writer.newLine();
            writer.write("We are writing to a file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
