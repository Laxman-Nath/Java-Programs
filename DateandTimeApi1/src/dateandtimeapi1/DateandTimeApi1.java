// Java date and time api
// it is also called Joda Date and Time API
// these classes are immutable
// time is presented in the form of seconds and nanoseconds
// there is seperate class for time,seperate class for date and seperate class containing both date and time

package dateandtimeapi1;
import java.util.*;
import java.time.*;
import java.time.temporal.*;
public class DateandTimeApi1 {

    public static void main(String[] args) {
       /* Date d=new Date();
        d.setHours(21);
        System.out.println(d);*/
      // LocalDate class is immutable  
 /*       LocalDate ld1=LocalDate.now();
        LocalDate ld2=LocalDate.now(Clock.systemDefaultZone());
        LocalDate ld3=LocalDate.now(ZoneId.of("Asia/Kathmandu"));
        LocalDate ld4=LocalDate.of(2024, Month.JANUARY, 18);
        LocalDate ld5=LocalDate.ofEpochDay(1);
        LocalDate ld6=LocalDate.parse("2020-01-03");
        LocalDate ld7=ld6.plusMonths(6);
        System.out.println(ld1);
        System.out.println(ld2);
        System.out.println(ld3);
        System.out.println(ld4);
        System.out.println(ld5);
        System.out.println(ld6);
        System.out.println(ld7);*/
 
/* LocalTime lt1=LocalTime.now();
 LocalTime lt2=LocalTime.of(12, 26);
 System.out.println(lt1);
 System.out.println(lt2);*/
   
LocalDateTime ldt1=LocalDateTime.now();
System.out.print(ldt1);
    }
    
}
