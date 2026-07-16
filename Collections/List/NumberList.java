package Collections.List;

import java.util.ArrayList;

public class NumberList {

    public static void main(String[] args) {

        ArrayList<Number> list=new ArrayList<>();

        list.add(10);
        list.add(25.5);
        list.add(30.75f);
        list.add(100L);
        list.add((short)15);

        System.out.println("Elements in the ArrayList:");

        for(Number n:list){
            System.out.println(n);
        }
    }
}