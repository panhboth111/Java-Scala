package Collections_11.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> students = new HashMap<>();
        //add elements
        students.put("John",19);
        students.put("Jim",20);
        students.put("Jessica",19);
        //add a map to another map
        HashMap<String,Integer> students2 = new HashMap<>();
        students2.putAll(students);
        //keySet()
        System.out.println(students.keySet());
        //entrySet()
        System.out.println(students.entrySet());
        //iterating through the map
        for(Map.Entry<String,Integer> e:students.entrySet()){
            System.out.println("Key:"+e.getKey());
            System.out.println("Key:"+e.getValue());
        }
        students.forEach((k,v)->{
            System.out.println("Key: "+k);
            System.out.println("Value: "+v);
        });
        //size()
        System.out.println(students.size());

    }
}
