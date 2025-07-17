package StringJoinerClass;

import java.util.Scanner;
import java.util.StringJoiner;

public class Q_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Create two StringJoiners with hyphen as the delimiter
        StringJoiner s1 = new StringJoiner(" - ");
        StringJoiner s2 = new StringJoiner(" - ");

        // Input for the first StringJoiner (s1)
        System.out.println("Enter city names for the first list (type 'done' to finish):");
        while (true) {
            String city = sc.nextLine().trim();
            if (city.equalsIgnoreCase("done")) {
                break; // Exit the loop if the user types "done"
            }
            if (!city.isEmpty()) {
                s1.add(city); // Add the city to s1 if it's not empty
            }
        }

        // Input for the second StringJoiner (s2)
        System.out.println("Enter city names for the second list (type 'done' to finish):");
        while (true) {
            String city = sc.nextLine().trim();
            if (city.equalsIgnoreCase("done")) {
                break; // Exit the loop if the user types "done"
            }
            if (!city.isEmpty()) {
                s2.add(city); // Add the city to s2 if it's not empty
            }
        }

        // i) Merge s1 to s2
        StringJoiner merged1 = new StringJoiner(" - ");
        merged1.merge(s1);
        merged1.merge(s2);
        System.out.println("s1 merged to s2: " + merged1.toString());

        // ii) Merge s2 to s1
        StringJoiner merged2 = new StringJoiner(" - ");
        merged2.merge(s2);
        merged2.merge(s1);
        System.out.println("s2 merged to s1: " + merged2.toString());
        
        sc.close(); // Close the scanner
    }
}
