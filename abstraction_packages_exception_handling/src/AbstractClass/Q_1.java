package AbstractClass;

import java.util.Random;

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "First Class Compartment";
    }
}

class Ladies extends Compartment {
    @Override
    public String notice() {
        return "Ladies Compartment";
    }
}

class General extends Compartment {
    @Override
    public String notice() {
        return "General Compartment";
    }
}

class Luggage extends Compartment {
    @Override
    public String notice() {
        return "Luggage Compartment";
    }
}

public class Q_1 {
    public static void main(String[] args) {
        // Declare the array of Compartment of size 10
        Compartment[] compartments = new Compartment[10];
        Random random = new Random();

        // Create compartments of type decided by a randomly generated integer in the range 1 to 4
        for (int i = 0; i < compartments.length; i++) {
            int compartmentType = random.nextInt(4) + 1; // Generates a number between 1 and 4

            switch (compartmentType) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }

        // Check the polymorphic behavior of the notice method
        for (Compartment compartment : compartments) {
            System.out.println(compartment.notice());
        }
    }
}
