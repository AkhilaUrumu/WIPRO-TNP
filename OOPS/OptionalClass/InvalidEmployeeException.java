package OOPS.OptionalClass;

public class InvalidEmployeeException extends RuntimeException{
    public InvalidEmployeeException(String msg){
        super(msg);
    }
}