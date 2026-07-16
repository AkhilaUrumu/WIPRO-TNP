package Collections.List.Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EmployeeVector {

    public static void main(String[] args){

        Vector<Employee> list=new Vector<>();

        list.add(new Employee(101,"Akhila",50000));
        list.add(new Employee(102,"Rahul",45000));
        list.add(new Employee(103,"Priya",55000));

        System.out.println("Using Iterator");

        Iterator<Employee> itr=list.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Using Enumeration");

        Enumeration<Employee> en=list.elements();

        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}