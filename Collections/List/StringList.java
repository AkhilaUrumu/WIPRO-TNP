package Collections.List;

import java.util.ArrayList;
import java.util.Iterator;

public class StringList {

    ArrayList<String> list=new ArrayList<>();

    public void add(String str){
        list.add(str);
    }

    public void printAll(){

        Iterator<String> itr=list.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args){

        StringList obj=new StringList();

        obj.add("Java");
        obj.add("Python");
        obj.add("C");
        obj.add("C++");
        obj.add("HTML");

        obj.printAll();
    }
}