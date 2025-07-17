package StringBuffer;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String and a number separated by comma (e.g., Wipro,3): ");
        String input = sc.nextLine().trim();
        
        String[] parts = input.split(",");
        
        if (parts.length != 2) {
            System.out.println("Invalid input format! Please enter in the format: string,number");
            return;
        }
        
        String str = parts[0].trim();
        int n;
        
        try {
            n = Integer.parseInt(parts[1].trim());
            if (n < 0 || n > str.length()) {
                System.out.println("Number must be between 0 and " + str.length());
                return;
            }
            
            String result = lastNCharsRepeat(str, n);
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format! Please enter a valid integer.");
        } finally {
            sc.close();
        }
    }
    
    public static String lastNCharsRepeat(String str, int n) {
        if (n == 0) return "";
        
        String lastNChars = str.substring(str.length() - n);
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            result.append(lastNChars);
        }
        
        return result.toString();
    }
}
