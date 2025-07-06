package Arrays;

import java.util.Scanner;

public class Q_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 9 integer numbers separated by space:");
        String inputLine = scanner.nextLine();
        String[] numbers = inputLine.split(" ");
        
        if (numbers.length != 9) {
            System.out.println("Error: Please enter exactly 9 integer numbers");
            scanner.close();
            return;
        }

        int[][] array = new int[3][3];
        int maxNumber = Integer.MIN_VALUE;

        try {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    array[i][j] = Integer.parseInt(numbers[i * 3 + j]);
                    if (array[i][j] > maxNumber) {
                        maxNumber = array[i][j];
                    }
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integer numbers");
            scanner.close();
            return;
        }

        System.out.println("The given array is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The biggest number in the given array is " + maxNumber);
        scanner.close();
    }
}
