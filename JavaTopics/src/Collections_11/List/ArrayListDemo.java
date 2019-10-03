package Collections_11.List;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> AL = new ArrayList<Integer>();
        for(int i=0;i<=10;i++){
            AL.add(i); //add element
        }
        ArrayList<Integer> AL2 = new ArrayList<>();
        AL2.addAll(AL); //add all elements of a collection to an ArrayList
        //iterate through a collection
        //1. using for loop
        for(int x:AL){
            System.out.println(x);
        }
        //2. using forEach
        AL2.forEach(n -> System.out.println(n));
        //3. using get
        for(int i = 0;i<AL.size();i++){
            System.out.println(AL.get(i));
        }
        //using iterator
        Iterator i = AL.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        //Checks if the ArrayList contains the specified element
        System.out.println(AL.contains(3));
        //Checks if the ArrayList is empty
        System.out.println(AL.isEmpty());
        //removes element
        AL.remove(3);
        //replace element
        AL.set(2,99);
        AL.forEach(n->System.out.println(n));
    }
}

