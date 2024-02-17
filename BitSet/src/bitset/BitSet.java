// bitset class in java 
// we can perform bitwise operations in this data structure
// when we create object of bitset,we get a array where each location contain true or false or  1 or 0
// It is present in java.util package
package bitset;
import java.util.*;
public class BitSet1 {

    public static void main(String[] args) {
       // Constructors of BitSet class
        BitSet bs1 = new BitSet();
        BitSet bs2 = new BitSet(6);
 
        /* set is BitSet class method
           explained in next articles */
        bs1.set(0);
        bs1.set(1);
        bs1.set(2);
        bs1.set(4);
 
        // assign values to bs2
        bs2.set(4);
        bs2.set(6);
        bs2.set(5);
        bs2.set(1);
        bs2.set(2);
        bs2.set(3);
 
        // Printing the 2 Bitsets
        System.out.println("bs1  : " + bs1);
        System.out.println("bs2  : " + bs2);
    }
    
}
