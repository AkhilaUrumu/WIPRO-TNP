package Abstraction.Exception_Handling.UserRegistration;

public class UserRegistration{

    public void registerUser(String userName,String userCountry)throws InvalidCountryException{

        if(!userCountry.equalsIgnoreCase("India")){
            throw new InvalidCountryException("User outside India cannot be registered");
        }

        System.out.println("User registration done successfully");
    }
}