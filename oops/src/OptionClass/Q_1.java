package OptionClass;

import java.util.Optional;
import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5]; // Array of Strings initialized to null

        // Input names from the user
        System.out.println("Enter 5 names (press Enter for a blank name):");
        for (int i = 0; i < names.length; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            String input = sc.nextLine().trim();
            // If the input is empty, we will keep it as null
            if (!input.isEmpty()) {
                names[i] = input; // Assign the input to the array
            }
        }

        // Check the length of the first name using Optional
        Optional<String> optionalName = Optional.ofNullable(names[0]);

        // Print the length if present, otherwise print a message
        optionalName.ifPresentOrElse(
            name -> System.out.println("Length of the first name: " + name.length()),
            () -> System.out.println("First name is null, cannot determine length.")
        );

        sc.close(); // Close the scanner
    }
}
