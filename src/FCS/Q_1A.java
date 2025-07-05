package FCS;
import java.util.Scanner;
class Q_1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("Positive number");
        } else if (n < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }
        sc.close();
    }

}