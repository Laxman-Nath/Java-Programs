
package bitset1;
import java.util.*;
public class Bitset1 {

  
    public static void main(String[] args) {
       BitSet bs1=new BitSet();
          BitSet bs2 = new BitSet(6);
      
          /* set is BitSet class method */
        bs1.set(0);
        bs1.set(1);
        bs1.set(2);
        bs1.set(4);
        
        bs2.set(4);
        bs2.set(6);
        bs2.set(5);
        bs2.set(1);
        bs2.set(2);
        bs2.set(3);
//        bs1.and(bs2);
         bs1.or(bs2);
        System.out.println(bs1);
       
       
    }
    
}