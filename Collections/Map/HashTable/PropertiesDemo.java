package Collections.Map.HashTable;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

    public static void main(String[] args){

        Properties p=new Properties();

        p.setProperty("Andhra Pradesh","Amaravati");
        p.setProperty("Telangana","Hyderabad");
        p.setProperty("Karnataka","Bengaluru");
        p.setProperty("Tamil Nadu","Chennai");

        Set<Object> states=p.keySet();

        Iterator<Object> itr=states.iterator();

        while(itr.hasNext()){

            Object state=itr.next();

            System.out.println(state+" -> "+p.getProperty((String)state));
        }
    }
}