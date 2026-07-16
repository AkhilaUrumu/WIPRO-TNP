package Collections.Set.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args){

        TreeSet<String> set=new TreeSet<>();

        set.add("India");
        set.add("USA");
        set.add("Japan");
        set.add("Australia");
        set.add("Canada");

        System.out.println("TreeSet Elements");
        System.out.println(set);

        System.out.println("\nReverse Order");

        Iterator<String> rev=set.descendingIterator();

        while(rev.hasNext()){
            System.out.println(rev.next());
        }

        System.out.println("\nUsing Iterator");

        Iterator<String> itr=set.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        String country="India";

        if(set.contains(country)){
            System.out.println("\n"+country+" exists");
        }
        else{
            System.out.println("\n"+country+" does not exist");
        }
    }
}