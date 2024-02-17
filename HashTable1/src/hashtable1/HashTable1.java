// hash table in java
package hashtable1;
import java.util.*;


public class HashTable1 {

    public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable();
       ht.put(1, "A");
        ht.put(2, "B");
        ht.put(3, "C");
        ht.put(4, "D");
        ht.put(5,"E");
        String s=(String)ht.get(3);
        Enumeration e=ht.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        System.out.println(ht);
    }
    
}
