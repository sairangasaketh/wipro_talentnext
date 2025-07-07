package FCS;

import java.util.*;

public class Q_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an alphabet: ");
        char Char = scanner.next().charAt(0);

        if (Character.isLowerCase(Char)) {
            System.out.println(Char + " -> " + Character.toUpperCase(Char));
        }

        if (Character.isUpperCase(Char)) {
            System.out.println(Char + " -> " + Character.toLowerCase(Char));
        }

        scanner.close();
    }
}
