package Collections.Map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args){

        HashMap<Integer,String> map=new HashMap<>();

        map.put(101,"Akhila");
        map.put(102,"Rahul");
        map.put(103,"Priya");
        map.put(104,"Kiran");

        System.out.println("Key Exists : "+map.containsKey(102));

        System.out.println("Value Exists : "+map.containsValue("Rahul"));

        Iterator<Map.Entry<Integer,String>> itr=map.entrySet().iterator();

        while(itr.hasNext()){
            Map.Entry<Integer,String> entry=itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}