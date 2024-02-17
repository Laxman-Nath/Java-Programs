/* Calendar and TimeZone class in java.
 Calendar is an abstract class this is because there are different types of classes present in the world.
 In india gregorian calender is used and in nepal bikram sambat calendar is used.
*/


package olddateandtimeclasses2;
import java.util.*;
public class OldDateandTimeclasses2 {

    
    public static void main(String[] args) {
        GregorianCalendar gc=new GregorianCalendar();
     /* System.out.println(gc);
        System.out.println(gc.isLeapYear(2020));
        System.out.println(gc.get(Calendar.DATE));
        System.out.println(gc.get(Calendar.MONTH));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
        System.out.println(gc.get(Calendar.HOUR));*/
      
     gc.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
     TimeZone tz=gc.getTimeZone();
     System.out.println(tz);
     System.out.println(tz.getDisplayName());
     System.out.println(tz.getID());
    }
 }
