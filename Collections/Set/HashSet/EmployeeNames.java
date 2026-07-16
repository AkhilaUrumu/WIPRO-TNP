package Collections.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeNames {

    public static void main(String[] args){

        HashSet<String> employees=new HashSet<>();

        employees.add("Akhila");
        employees.add("Rahul");
        employees.add("Priya");
        employees.add("Kiran");

        Iterator<String> itr=employees.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}