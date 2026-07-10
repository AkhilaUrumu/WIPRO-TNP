package Abstraction.Exception_Handling.UserRegistration;

public class Main{

    public static void main(String[]args){

        UserRegistration user=new UserRegistration();

        try{

            user.registerUser(args[0],args[1]);

        }
        catch(InvalidCountryException e){

            System.out.println(e.getMessage());

        }
    }
}