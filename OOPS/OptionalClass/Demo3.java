package OOPS.OptionalClass;

import java.util.Optional;

public class Demo3{
    public static void main(String[]args){
        Employee emp=null;
        Employee e=Optional.ofNullable(emp)
                .orElseThrow(()->new InvalidEmployeeException("Employee Object is Null"));
        e.display();
    }
}