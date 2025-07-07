package Arrays;

import java.util.Scanner;


public class Q_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] asciiValues = new int[size];
        System.out.println("Enter " + size + " ASCII values:");
        for (int i = 0; i < size; i++) {
            asciiValues[i] = scanner.nextInt();
        }

        StringBuilder result = new StringBuilder();
        for (int value : asciiValues) {
            result.append((char) value);
        }
        
        System.out.println(result.toString());
        scanner.close();
    }
}
