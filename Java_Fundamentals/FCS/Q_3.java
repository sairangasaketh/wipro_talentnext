package FCS;
import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter values separated by spaces: ");
        String input = scanner.nextLine().trim();
        
        if (input.isEmpty()) {
            System.out.println("No values provided.");
        } else {
            String[] values = input.split("\\s+");
            System.out.print("Values entered: ");
            for (int i = 0; i < values.length; i++) {
                System.out.print(values[i]);
                if (i < values.length - 1) {
                    System.out.print(",");
                }
            }
        }
        
        scanner.close();
    }
}
