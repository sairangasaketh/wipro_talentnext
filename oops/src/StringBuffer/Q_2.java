package StringBuffer;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String (two words separated by a comma): ");
        String input = sc.nextLine().trim();
        
        String[] words = input.split(",");

        if (words.length < 2) {
            System.out.println("Error: Please enter two words separated by a comma.");
        } else {
            String s1 = words[0].trim().toLowerCase();
            String s2 = words[1].trim().toLowerCase();

            String result = concatenate(s1, s2);
            System.out.println("Result: " + result);
        }
        
        sc.close();
    }

    public static String concatenate(String s1, String s2) {
        if (s1.charAt(s1.length() - 1) == s2.charAt(0)) {
            return s1.substring(0, s1.length() - 1) + s2;
        }
        return s1 + " " + s2;
    }
}
