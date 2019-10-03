package Collections_11.List;
import java.util.*;
public class LinkedLIstDemo {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>();
        //add elements
        for(int i=0;i<=10;i++){
            LL.add(i);
        }
        //retrieve and remove the first element
        System.out.println("First element");
        System.out.println("getFirst():"+LL.getFirst());
        System.out.println("pollFirst():"+LL.pollFirst());
        //retrieve and remove the last element
        System.out.println("Last Element");
        System.out.println("getLast():"+LL.getLast());
        System.out.println("pollLast():"+LL.pollLast());
        //iterate through the list
        System.out.println("using forEach(): ");
        LL.forEach(n->System.out.println(n));
        System.out.println("using for loop: ");
        for(int i:LL){
            System.out.println(i);
        }
        System.out.println("using indexing: ");
        for(int i=0;i<LL.size();i++){
            System.out.println(LL.get(i));
        }
    }
}
