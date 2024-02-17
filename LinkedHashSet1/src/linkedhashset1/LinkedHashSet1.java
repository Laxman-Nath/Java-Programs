 // linkedhashset in java
// In linkedhashmap you will get the element in not sorted order while printing they are displayed in the order
// of they are inserted but in hashmap element will printed in sorted order while printing
package linkedhashset1;
import java.util.*;
public class LinkedHashSet1 {

    public static void main(String[] args) {
        LinkedHashSet<String> lh1=new LinkedHashSet<>(10);
      
        lh1.add("B");
        lh1.add("C");
        lh1.add("D");
        lh1.add("F");
        lh1.add("E");
        lh1.add("A");
        Iterator il1=lh1.iterator();
        while(il1.hasNext()){
            System.out.println(il1.next());
        }
    }
    
}
