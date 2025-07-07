package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(nums));
        int[] result = removeTens(nums);
        System.out.println("Array with 10's removed: " + Arrays.toString(result));
        
        scanner.close();
    }

    public static int[] removeTens(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num != 10) {
                nums[count++] = num;
            }
        }

        while (count < nums.length) {
            nums[count++] = 0;
        }

        return nums;
    }
}
