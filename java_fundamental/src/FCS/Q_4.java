package FCS;

import java.util.*;

public class Q_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first character variable: ");
        char ch1 = sc.next().charAt(0);

        System.out.print("Enter the second character variable: ");
        char ch2 = sc.next().charAt(0);

        if (ch1 < ch2) {
            System.out.println(ch1 + "," + ch2);
        } else {
            System.out.println(ch2 + "," + ch1);
        }
        sc.close();
    }
}