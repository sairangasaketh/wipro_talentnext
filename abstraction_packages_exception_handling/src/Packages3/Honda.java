package Packages3;

import Packages3.automobile.Vehicle;

public class Honda extends Vehicle {
    int speed = 120;

    public int getSpeed() {
        return speed;
    }

    public void cdplayer() {
        System.out.println("Controlling CD Player!!!");
    }

    @Override
    public String getModelName() {
        return "Honda";
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