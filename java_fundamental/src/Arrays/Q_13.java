package Arrays;

import java.util.Scanner;

public class Q_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 4 integer numbers:");
        
        int[][] matrix = new int[2][2];
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                while (!scanner.hasNextInt()) {
                    System.out.println("Please enter an integer number:");
                    scanner.next(); // discard invalid input
                }
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("The given array is:");
        printMatrix(matrix);
        
        System.out.println("The reverse of the array is:"); 
        printReverseMatrix(matrix);
        
        scanner.close();
    }

    private static void printMatrix(int[][] mat) {
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printReverseMatrix(int[][] mat) {
        for(int i = 1; i >= 0; i--) {
            for(int j = 1; j >= 0; j--) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
