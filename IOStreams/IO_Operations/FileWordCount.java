package IOStreams.IO_Operations;

import java.io.*;
import java.util.*;

public class FileWordCount {

    public static void main(String[] args) {

        if(args.length!=2){
            System.out.println("Usage: java FileWordCount inputFile.txt outputFile.txt");
            return;
        }

        TreeMap<String,Integer> map=new TreeMap<>();

        try{
            Scanner sc=new Scanner(new File(args[0]));

            while(sc.hasNext()){
                String word=sc.next();
                if(map.containsKey(word)){
                    map.put(word,map.get(word)+1);
                }else{
                    map.put(word,1);
                }
            }

            sc.close();

            PrintWriter pw=new PrintWriter(new FileWriter(args[1]));

            for(Map.Entry<String,Integer> entry:map.entrySet()){
                pw.println(entry.getKey()+" : "+entry.getValue());
            }

            pw.close();

            System.out.println("Word count written to "+args[1]);
        }
        catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}