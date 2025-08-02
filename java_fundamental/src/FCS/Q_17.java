package FCS;

import java.util.Scanner;

public class Q_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        int number;
        
        try {
            number = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.close();
            return;
        }
        
        
        if (isNumberPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
        
        scanner.close();
    }

    public static boolean isNumberPalindrome(int input) {
        int temp = input;
        int reversed = 0;
        
        while (temp != 0) {
            int lastDigit = temp % 10;
            reversed = reversed * 10 + lastDigit;
            temp /= 10;
        }
        
        return input == reversed;
    }
}
