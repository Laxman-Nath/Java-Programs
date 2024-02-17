
package arraydeque2;
import java.util.*;
public class ArrayDeque2 {


    public static void main(String[] args) {
        ArrayDeque<Integer> a1=new ArrayDeque<>();
//        a1.offerLast(1);
//        a1.offerLast(2);
//        a1.offerLast(3);
//        
//        a1.offerFirst(4);
//        a1.offerFirst(5);
//        a1.offerFirst(6);
       a1.addLast(23);
       a1.addLast(34);
       a1.removeLast();
       
        a1.forEach((n)->System.out.println(n));
    }
    
}
