package Abstraction.Packages.com.automobile.fourwheeler;

import Abstraction.Packages.com.automobile.Vehicle;

public class Logan extends Vehicle{

    public String getModelName(){
        return "Logan";
    }

    public String getRegistrationNumber(){
        return "AP39EF1111";
    }

    public String getOwnerName(){
        return "Akhila";
    }

    public int speed(){
        return 120;
    }

    public int gps(){
        return 1;
    }
}