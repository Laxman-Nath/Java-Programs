 // Linked hash map in java
package linkedhashmap1;
import java.util.*;
public class LinkedHashMap1 {

    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm1=new LinkedHashMap<>(5)
        {
            protected boolean removeEldestEntry(Map.Entry e){
                return size()>5;
            }
        };
        lhm1.put(1, "A");
        lhm1.put(2,"B");
        lhm1.put(3, "C");
        lhm1.put(4, "D");
        lhm1.put(5, "E");
//      
//        lhm1.put(9, "I");
//        lhm1.put(8, "H");
          System.out.println(lhm1.get(2));
          System.out.println(lhm1.get(5));
          System.out.println(lhm1.get(1));
            lhm1.put(6, "F");
        lhm1.forEach((k , v)->System.out.println(k +" "+v));
    }
    
}
