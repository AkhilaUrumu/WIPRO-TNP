package Abstraction.Packages.com.automobile.fourwheeler;

import Abstraction.Packages.com.automobile.Vehicle;

public class Ford extends Vehicle{

    public String getModelName(){
        return "Ford";
    }

    public String getRegistrationNumber(){
        return "AP39GH2222";
    }

    public String getOwnerName(){
        return "Urumu";
    }

    public int speed(){
        return 140;
    }

    public int tempControl(){
        return 22;
    }
}