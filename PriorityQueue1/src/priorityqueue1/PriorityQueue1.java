// Priority queue in java
package priorityqueue1;
import java.util.*;
public class PriorityQueue1 {
// always the minimum element will be deleted first actually it will create a min heap means it will create a binar
//     tree and root element is always smaller than it's child. By default it will create a min heap 
    public static void main(String[] args) {
        PriorityQueue<Integer> p1=new PriorityQueue<>();
        p1.add(10);
        p1.add(20);
        p1.add(30);
        p1.add(3);
        System.out.println(p1);
        p1.poll();
        System.out.println("After deleting:");
        p1.forEach((n)->System.out.println(n));
    }
    
}
