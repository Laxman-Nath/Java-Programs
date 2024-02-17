// implementing the priority queue using max heap.for this we define class implementing comparator
package priorityqueue2;
import java.util.*;
class MyCom implements Comparator<Integer>{
    public int compare(Integer o1,Integer o2){
        if(o1<o2) return 1;
        if(o1>o2) return -1;
        else return 0;
    }
}
public class PriorityQueue2 {

    public static void main(String[] args) {
        PriorityQueue<Integer> p1=new PriorityQueue<>(new MyCom());
        p1.add(40);
        p1.add(50);
        p1.add(100);
        p1.add(200);
        p1.add(400);
        p1.forEach((n)->System.out.println(n));
  
        p1.poll();
        System.out.println("After deletion:");
                p1.forEach((n)->System.out.println(n));
        
        
    }
    
}
