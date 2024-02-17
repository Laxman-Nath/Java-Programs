// DateTimeFormatter in java
package dateandtimeapi3;
import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoField;

public class DateandTimeApi3 {

  
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now();
        ZonedDateTime zd1=ZonedDateTime.now();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM//yyyy");
         DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/MM//yy"
                 + "yy hh:mm:ss");
          DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd/MM//yyyy hh:mm:ss z");
          DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd/MM//yyyy hh:mm:ss z Z");
        System.out.println(dtf.format(ldt));
        System.out.println(dtf1.format(ldt));
        System.out.println(dtf2.format(zd1));
        System.out.println(dtf3.format(zd1));
        System.out.println(ldt.get(ChronoField.DAY_OF_MONTH));
          System.out.println(ldt.get(ChronoField.YEAR));
    }
    
}
