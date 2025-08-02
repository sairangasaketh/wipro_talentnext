package FCS;

import java.util.Scanner;

public class Q_16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = s.nextInt();
        
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        
        System.out.println("Reversed: " + rev);
        s.close();
    }
}
