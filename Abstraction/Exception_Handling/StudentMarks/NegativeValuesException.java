package Abstraction.Exception_Handling.StudentMarks;

public class NegativeValuesException extends Exception{

    public NegativeValuesException(String message){
        super(message);
    }
}