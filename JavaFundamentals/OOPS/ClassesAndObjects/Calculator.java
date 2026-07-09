package JavaFundamentals.OOPS.ClassesAndObjects;

public class Calculator{

    static int powerInt(int num1,int num2){
        return (int)Math.pow(num1,num2);
    }
    static double powerDouble(double num1,double num2){
        return Math.pow(num1,num2);
    }
    public static void main(String args[]){
        System.out.println("Power of Integers = "+powerInt(2,3));
        System.out.println("Power of Doubles = "+powerDouble(2.5,2));
    }
}