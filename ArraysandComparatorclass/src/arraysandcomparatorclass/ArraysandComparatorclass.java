// Arrays class and comparator interface in java
// Arrays class is present in java.util.package
package arraysandcomparatorclass;
import java.util.*;

class My implements Comparator<Integer>{
    @Override
    public int compare(Integer i1,Integer i2){
        if(i1<i2){
            return 1;
        }
        if(i1>i2){
            return -1;
        }
        return 0;
    } 
}
public class ArraysandComparatorclass {

    public static void main(String[] args) {
        int a[]={2,4,6,8,1,3,5,7};
        int b[]={2,4,6,8,1,3,5,7};
        Integer d[]={2,4,6,8,1,3,5,7};
    /* int c[]=   Arrays.copyOf(a, a.length);
     Arrays.fill(c, 10);
      for(int x : c){
         System.out.println(x);
     }*/
     Arrays.sort(d, new My());
//     System.out.println(Arrays.binarySearch(d, 2));
      for(int x : d){
         System.out.println(x);
     }
    
//       System.out.println( Arrays.compare(a, b));
       
       
    }
    
}
