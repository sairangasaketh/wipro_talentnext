package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Q_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter size of first array: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter " + size1 + " elements for first array:");
        for(int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }
        
        System.out.print("Enter size of second array: ");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter " + size2 + " elements for second array:");
        for(int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }
        
        int[] ans = middleElements(arr1, arr2);
        System.out.println("Middle elements: " + Arrays.toString(ans));
        
        scanner.close();
    }

    public static int[] middleElements(int[] a, int[] b) {
        int mid1 = a[a.length / 2];
        int mid2 = b[b.length / 2]; 
        return new int[] { mid1, mid2 };
    }
}
