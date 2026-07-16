package Collections.Map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContactList {

    public static void main(String[] args){

        HashMap<String,Integer> contacts=new HashMap<>();

        contacts.put("Akhila",987654321);
        contacts.put("Rahul",987654322);
        contacts.put("Priya",987654323);
        contacts.put("Kiran",987654324);

        System.out.println("Key Exists : "+contacts.containsKey("Rahul"));

        System.out.println("Value Exists : "+contacts.containsValue(987654323));

        Iterator<Map.Entry<String,Integer>> itr=contacts.entrySet().iterator();

        while(itr.hasNext()){
            Map.Entry<String,Integer> entry=itr.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}