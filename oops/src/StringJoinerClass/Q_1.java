package StringJoinerClass;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class Q_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        
        System.out.println("Enter names (type 'exit' to finish):");
        
        while (true) {
            String name = sc.nextLine().trim();
            if (name.equalsIgnoreCase("exit")) {
                break; // Exit the loop if the user types "exit"
            }
            if (!name.isEmpty()) {
                names.add(name); // Add the name to the list if it's not empty
            }
        }

        // Create a StringJoiner with comma separator and { } brackets
        StringJoiner joiner = new StringJoiner(", ", "{", "}");

        // Add all names to the StringJoiner
        for (String name : names) {
            joiner.add(name);
        }

        // Get the final formatted string
        String result = joiner.toString();

        // Output the result
        System.out.println("Formatted names: " + result);
        
        sc.close(); // Close the scanner
    }
}
