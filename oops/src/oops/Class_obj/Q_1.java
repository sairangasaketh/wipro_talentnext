package oops.Class_obj;

import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        
        System.out.print("Enter depth: "); 
        double depth = scanner.nextDouble();
        
        Box myBox = new Box(width, height, depth);
        
        System.out.println("Box Dimensions:");
        System.out.println("Width: " + myBox.getWidth());
        System.out.println("Height: " + myBox.getHeight());
        System.out.println("Depth: " + myBox.getDepth());
        
        System.out.println("Volume: " + myBox.calculateVolume());
        
        scanner.close();
    }
}

class Box {
    private double width;
    private double height;
    private double depth;
    
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public double getDepth() {
        return depth;
    }
    
    public double calculateVolume() {
        return width * height * depth;
    }
}
