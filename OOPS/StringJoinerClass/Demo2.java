package OOPS.StringJoinerClass;

import java.util.StringJoiner;

public class Demo2{
    public static void main(String[]args){
        StringJoiner s1=new StringJoiner("-");
        s1.add("Hyderabad");
        s1.add("Chennai");
        s1.add("Bangalore");
        StringJoiner s2=new StringJoiner("-");
        s2.add("Delhi");
        s2.add("Mumbai");
        s2.add("Pune");
        StringJoiner m1=new StringJoiner("-");
        m1.merge(s2);
        m1.merge(s1);
        System.out.println("s1 merged to s2:");
        System.out.println(m1);
        StringJoiner m2=new StringJoiner("-");
        m2.merge(s1);
        m2.merge(s2);
        System.out.println("s2 merged to s1:");
        System.out.println(m2);
    }
}