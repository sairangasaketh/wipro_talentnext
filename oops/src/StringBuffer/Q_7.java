package StringBuffer;

import java.util.Scanner;


public class Q_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.next().trim();

        String result = func(str);
        System.out.println("Result : " + result);
        sc.close();
    }

    public static String func(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'x') {
                break;
            } else {
                str = str.substring(i + 1, str.length());
            }
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != 'x') {
                break;
            } else {
                str = str.substring(0, i);
            }
        }
        return str;
    }
}