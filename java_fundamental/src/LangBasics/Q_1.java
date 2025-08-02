package LangBasics;
import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter company name: ");
        String Company = sc.nextLine();
        
        System.out.print("Enter city name: ");
        String City = sc.nextLine();
        
        System.out.println(Company + " Technologies " + City);
        
        sc.close();
    }
}
