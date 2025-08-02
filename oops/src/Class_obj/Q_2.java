package Class_obj;

import java.util.Scanner;

public class Q_2 {
    static double powerInt(int num1, int num2) {
        return Math.pow(num1, num2);
    }

    static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Power Calculator ---");
        
        System.out.print("Enter first number (int): ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number (int): ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter a double number: ");
        double doubleNum = scanner.nextDouble();
        
        System.out.println("Integer power result: " + powerInt(num1, num2));
        System.out.println("Double power result: " + powerDouble(doubleNum, num2));
        
        scanner.close();
    }
}
