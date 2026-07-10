package Abstraction.MiniProject2.com.milel.exception;

public class NullStudentObjectException extends Exception{

    public NullStudentObjectException(){
        super();
    }

    public NullStudentObjectException(String message){
        super(message);
    }
}