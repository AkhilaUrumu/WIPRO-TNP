package Abstraction.Interfaces_new_features.prg_1;

public class Car implements Vehicle,FourWheeler{

    public void message(){
        Vehicle.super.message();
    }

    public static void main(String[]args){
        Car c=new Car();
        c.message();
    }
}