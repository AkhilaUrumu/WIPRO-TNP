package Abstraction.Interfaces_new_features.prg_1;

public interface Vehicle{

    default void message(){
        System.out.println("Inside Vehicle");
    }
}