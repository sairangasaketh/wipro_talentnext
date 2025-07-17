package Packages4.com.automobile.fourwheeler;

import Packages3.automobile.Vehicle;

public class Ford extends Vehicle {
    
    public int speed (){
        System.out.println("Current Speed...");
        return 0; 
    }
    public int tempControl() 
    {
        System.out.println("Providing  facility to control air conditionaing device available in car  ");
        return 100 ; 

    }



    @Override
    public String getModelName() {
        return "Ford ";
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