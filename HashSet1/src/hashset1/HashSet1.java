// Hashset ->It does not allow duplicate element,(Loading factor means how much space of hash table will be used
// if loading factor is 0.5 it means 50% space of hash table only used.
package hashset1;
import java.util.*;
public class HashSet1 {

   
    public static void main(String[] args) {
     HashSet<Integer> h1=new HashSet<>();// 16 is hash table size and 0.75 is loading factor
     HashSet<Integer> h2=new HashSet<>(20,0.5f); // 20 is hash table size and 0.5 is loading factor
     h1.add(20);
     h1.add(30);
     h1.add(20);
     h1.add(1);
     System.out.println(h1);
    }
    
}
