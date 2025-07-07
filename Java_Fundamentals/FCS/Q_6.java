package FCS;

import java.util.Scanner;

public class Q_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter gender: ");
        String gender = scanner.nextLine().trim();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        if (age <= 0 || age > 100) {
            System.out.println("Invalid age.");
        } else if (gender.equalsIgnoreCase("Female")) {
            System.out.println("Percentage of interest: " + (age <= 58 ? "8.2%" : "9.2%"));
        } else if (gender.equalsIgnoreCase("Male")) {
            System.out.println("Percentage of interest: " + (age <= 58 ? "8.4%" : "10.5%"));
        } else {
            System.out.println("Invalid gender.");
        }

        scanner.close();
    }
}
