package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Q_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        inputValues(sc, arr);

        int[] uniqueArr = unique(arr);

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Array with unique elements: " + Arrays.toString(uniqueArr));
        
        sc.close();
    }

    public static int[] unique(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int[] uniqueArr = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArr[index++] = num;
        }
        return uniqueArr;
    }

    public static void inputValues(Scanner sc, int[] arr) {
        System.out.println("Enter " + arr.length + " integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
}
