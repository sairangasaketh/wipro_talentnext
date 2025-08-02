package Arrays;

import java.util.Arrays;

import java.util.Scanner;

public class Q_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size]; // Initialize the array
        
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt(); // Take input for each element
        }
        
        Arrays.sort(numbers); // Sort the array
        
        System.out.println("Sorted array: ");
        for (int number : numbers) {
            System.out.print(number + " "); // Print each number
        }
        
        scanner.close(); // Close the scanner
    }
}
