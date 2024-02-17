// Old data and time classes in java
// These old date and time classes were present in java.util package
// seconds=milliseconds/1000;
//minutes=seconds/60;
// hours=minutes/60;
// day=hours/24;
// year=day/365;
// There is date class present in java.util package
// Date class work based on milliseconds 
package olddataandtimeclasses1;
import java.util.*;

public class OldDataandTimeclasses1 {

    
    public static void main(String[] args) {
     /*   System.out.println(System.currentTimeMillis()); // This method will give no of milliseconds passed from
        // 1st janauary 1970 to current data and time
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365); // calculating years from milleseconds
        System.out.println(Long.MAX_VALUE);*/
     
     Date d=new Date();
     Date d1=new Date("1/1/1980");
     System.out.println(d1);
     System.out.println(d); // gives current data and time
     System.out.println(d.getTime()); // gives time in milliseconds
     System.out.println(d.getDay()); // gives the current day in number here sunday=0,monday=1......
     System.out.println(d.getHours());
      System.out.println(d.getMonth());
      System.out.println(d1.getMonth());
    }
    
}
