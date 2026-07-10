package Abstraction.Exception_Handling.PersonValidation;

public class InvalidAgeException extends Exception{

    public InvalidAgeException(String message){
        super(message);
    }
}