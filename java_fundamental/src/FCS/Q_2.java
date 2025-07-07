package FCS;

import java.util.*;

public class Q_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        if ((a & 1) == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        sc.close();
    }
}