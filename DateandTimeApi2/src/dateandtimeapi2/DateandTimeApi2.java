
package dateandtimeapi2;
import java.time.*;
import java.time.temporal.*;
/**
 *
 * @author Aum com mnr
 */
public class DateandTimeApi2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* ZonedDateTime zdt1=ZonedDateTime.now();
        ZonedDateTime zd2=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
          System.out.println(zdt1);
          System.out.println(zd2);*/
        
        
       /* OffsetDateTime of1=OffsetDateTime.now();
        System.out.println(of1);
        System.out.println(of1.getDayOfMonth());
        System.out.println(of1.getDayOfWeek());*/
       
      /* MonthDay md1=MonthDay.now();
       System.out.println(md1);
       System.out.println(md1.getMonth());*/
      
    /*  YearMonth ym1=YearMonth.now();
      System.out.println(ym1);*/
    
   /* Year y1=Year.now();
    System.out.println(y1);*/
   
 /*  Period p1=Period.of(2,2,10);
   System.out.println(p1);
   System.out.println(p1.addTo(LocalDate.now()));*/
 
 Instant i=Instant.now();
 System.out.println(i);
    }
    
    
}
