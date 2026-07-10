package OOPS.Strings;

public class Concatenate2Strings {
    public static void main(String[]args){
        String s1="Sachin";
        String s2="Tendulkar";
        if(s1.charAt(s1.length()-1)==s2.charAt(0)){
            System.out.println((s1+s2.substring(1)).toLowerCase());
        }else{
            System.out.println((s1+s2).toLowerCase());
        }
    }
}