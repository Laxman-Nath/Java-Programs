// Doubly linked list in java
package linkedlistpractice1;
import java.util.*;
public class LinkedListPractice1 {

    
    public static void main(String[] args) {
       LinkedList<Integer> l1=new LinkedList<>();
       LinkedList<Integer> l2=new LinkedList<>(List.of(10,20,30,40,50));
       l1.add(100);
       l1.add(200);
       l1.addFirst(300);
       l1.addLast(500);
//     System.out.println(l1.contains(100));
//     System.out.println( l1.containsAll(l2));
//     l1.clear();
//     System.out.println( l1.get(0));
//    System.out.println(l1.peek());
//    System.out.println(l1.peekFirst());
       System.out.println(l1.peekLast());
       System.out.println(l2);
       System.out.println(l1);
    }
    
}
