package Assignments;

import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        String binary = Integer.toBinaryString(num);
        binary = String.format("%8s", binary).replace(' ', '0');

        System.out.println("Binary representation: " + binary);

        sc.close();
    }
}