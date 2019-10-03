package Collections_11.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
        //add element
        for(int i=0;i<=10;i++){
            s.add(i);
        }
        System.out.println("Loop through the set:");
        System.out.println("using forEach(): ");
        s.forEach(n->System.out.println(n));
        System.out.println("using for loop: ");
        for(int x:s){
            System.out.println(x);
        }
        System.out.println("iterator: ");
        Iterator i = s.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        //addAll
        HashSet<Integer> s2 = new HashSet<>();
        s2.addAll(s);
        System.out.println("s2: ");
        s2.forEach(n->System.out.println(n));
        //clear
        System.out.println("After clear(): ");
        s2.clear();
        s2.forEach(n->System.out.println(n));
        //size
        System.out.println("the length of the set: "+s.size());
        //remove
        s.remove(5);
        //contains
        System.out.println(s.contains(5));
        System.out.println(s2.contains(5));
        //isEmpty
        System.out.println(s.isEmpty());
        System.out.println(s2.isEmpty());
    }
}
