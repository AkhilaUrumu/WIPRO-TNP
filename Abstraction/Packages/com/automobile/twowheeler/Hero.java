package Abstraction.Packages.com.automobile.twowheeler;

import Abstraction.Packages.com.automobile.Vehicle;

public class Hero extends Vehicle{

    public String getModelName(){
        return "Hero Splendor";
    }

    public String getRegistrationNumber(){
        return "AP39AB1234";
    }

    public String getOwnerName(){
        return "Akhila";
    }

    public int getSpeed(){
        return 80;
    }

    public void radio(){
        System.out.println("Radio is ON");
    }
}