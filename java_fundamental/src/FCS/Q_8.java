package FCS;

import java.util.*;

public class Q_8 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a color code (R/B/G/O/Y/W): ");
        char colorCode = Character.toUpperCase(inputScanner.next().charAt(0));

        switch (colorCode) {
            case 'R' -> System.out.println("Red");
            case 'B' -> System.out.println("Blue");
            case 'G' -> System.out.println("Green");
            case 'O' -> System.out.println("Orange");
            case 'Y' -> System.out.println("Yellow");
            case 'W' -> System.out.println("White");
            default -> System.out.println("Invalid Code");
        }

        inputScanner.close();
    }
}
