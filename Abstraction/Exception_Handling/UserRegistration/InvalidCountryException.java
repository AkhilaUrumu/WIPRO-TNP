package Abstraction.Exception_Handling.UserRegistration;

public class InvalidCountryException extends Exception{

    public InvalidCountryException(){
        super();
    }

    public InvalidCountryException(String message){
        super(message);
    }
}