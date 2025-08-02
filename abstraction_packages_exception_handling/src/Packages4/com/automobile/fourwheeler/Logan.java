package Packages4.com.automobile.fourwheeler;

import Packages3.automobile.Vehicle;

public class Logan extends Vehicle {
    
    public int speed() {
        System.out.println("Current Speed....");
        return 0; 
    }
    public int gps() 
    {
        System.out.println("Providing  facility to control gps device ");
        return 0 ;
    }



    @Override
    public String getModelName() {
        return "Logan";
    }

    @Override
    public String getRegistrationNumber() {
        return "KA1CR21CS027";
    }

    @Override
    public String getOwnerName() {
        return "Ms. Anchal Singh";
    }

}