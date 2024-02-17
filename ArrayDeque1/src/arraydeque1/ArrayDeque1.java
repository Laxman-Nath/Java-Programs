// ArrayDeque in java(It can insert and delete element from both rear and front end)
package arraydeque1;
import java.util.*;
public class ArrayDeque1 {

    
    public static void main(String[] args) {
        ArrayDeque<Integer> a1=new ArrayDeque<>();
        ArrayDeque<Integer> a3=new ArrayDeque<>();
            ArrayDeque<Integer> a2=new ArrayDeque<>(List.of(1,2,3,4,5));
            a1.add(23);//Inserts the specified element at the end of this deque.
            a1.add(100);
            a1.addFirst(50);//Inserts the specified element at the front of this deque.
            a1.addLast(200);//Inserts the specified element at the end of this deque.
//            a1.clear();//Removes all of the elements from this deque.
            a1.addAll(a2); // insert elements of a2 in a1
            a3=a1.clone(); // Returns a copy of this deque
//            System.out.println(a1.contains(23));//Returns true if this deque contains the specified element.
//             System.out.println(a1.containsAll(a2));// Returns true if this deque contains the  all  element of specified deque
//             Iterator<Integer> d1=a1.descendingIterator();// Returns an iterator over the elements in this deque in reverse sequential order.
//                while(d1.hasNext()){
//                    System.out.println(d1.next());
//                }
//        a1.forEach((n)->System.out.println(n));
  
         System.out.println( a1.element());  //Retrieves, but does not remove, the head of the queue represented by this deque.
          System.out.println(a1.getFirst());// Retrieves, but does not remove, the first element of this deque
          System.out.println(a1.getLast());// Retrieves, but does not remove, the last element of this deque
         System.out.println(a1.isEmpty());// Returns true if this deque contains no elements.
         
         System.out.println(a3);
            System.out.println(a1);
    }
    
}
