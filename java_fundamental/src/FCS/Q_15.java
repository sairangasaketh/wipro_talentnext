package FCS;
import java.util.*;

public class Q_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) 
                System.out.print("* ");
            System.out.println();
        }
        
        sc.close(); // Close the Scanner to avoid the warning
    }
}
