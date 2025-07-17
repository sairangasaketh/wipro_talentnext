package Assignments;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q_1 {
    public static void main(String[] args) {
        File file = new File("Input.txt");
        
        // Create the file if it does not exist
        if (!file.exists()) {
            try {
                FileWriter writer = new FileWriter(file);
                writer.write("This is a sample text with some letters.\n");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Now read the file
        try {
            FileReader reader = new FileReader(file);
            char searchChar = 'r'; // Character to be counted
            int charCount = 0;
            int charRead;
            while ((charRead = reader.read()) != -1) {
                if ((char) charRead == searchChar) {
                    charCount++;
                }
            }
            reader.close();
            System.out.println("File 'Input.txt' has " + charCount + " instances of letter '" + searchChar + "'.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
