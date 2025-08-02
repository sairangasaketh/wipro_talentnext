package Exception_Handling;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String str) {
        super(str);
    }
}

class InvalidNumberOfInputException extends Exception {
    InvalidNumberOfInputException(String str) {
        super(str);
    }
}

public class Q_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for name
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            // Prompt user for age
            System.out.print("Enter your age: ");
            String ageInput = scanner.nextLine();
            int age = Integer.parseInt(ageInput);

            // Check if age is within the valid range
            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("Age should be between 18 and 59.");
            }

            // If everything is fine, print the name and age
            System.out.println("Name: " + name + ", Age: " + age);

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
            System.exit(1); // Exit the program with an error code
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Age must be a number.");
            System.exit(1); // Exit the program with an error code
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1); // Exit the program with an error code
        } finally {
            scanner.close(); // Close the scanner
        }
    }
}
