package Assignments.List;

import java.util.ArrayList;


public class Q_4 {
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(10); // Integer
        numbers.add(3.14); // Double
        numbers.add(5.6f); // Float

        // Print the numbers
        for (Number num : numbers) {
            System.out.println(num);
        }
    }
}