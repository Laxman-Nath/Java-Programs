// HashMap in java
// hash will not be sorted tree will all be sorted
package hashmap1;
import java.util.*;
public class HashMap1 {
    
    public static void main(String[] args) {
      HashMap<Integer,String> h1=new HashMap<>(Map.of(1,"A",2,"B",3,"C"));
        h1.put(4, "D");

       h1.put(6, "F");
              h1.put(5, "E");
       System.out.println(h1);
        
    }
    
}
