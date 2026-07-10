package Abstraction.Interfaces_new_features.prg_1;

public interface FourWheeler{

    default void message(){
        System.out.println("Inside FourWheeler");
    }
}