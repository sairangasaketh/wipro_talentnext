package FCS;
import java.util.Scanner;
public class Q_1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first non-negative integer: ");
        int a = sc.nextInt();

        System.out.print("Enter the second non-negative integer: ");
        int b = sc.nextInt();

        if (a % 10 == b % 10) {
            System.out.println("Both numbers have the same last digit.");
        } else {
            System.out.println("Both numbers do not have the same last digit.");
        }

        sc.close();
    }
}