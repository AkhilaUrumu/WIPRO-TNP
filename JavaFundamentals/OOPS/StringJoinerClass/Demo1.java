package JavaFundamentals.OOPS.StringJoinerClass;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Demo1{
    public static void main(String[]args){
        ArrayList<String>names=new ArrayList<>();
        names.add("Akhila");
        names.add("Anu");
        names.add("Sai");
        names.add("Ram");
        StringJoiner sj=new StringJoiner(",","{","}");
        for(String name:names){
            sj.add(name);
        }
        System.out.println(sj);
    }
}