
package staticpractice5;
import java.util.*;
class Customer{
    private String custID;
    private static int count=1;
    private String generateId(){
        Date d=new Date();
         String id="BBMART-"+(d.getYear()+1900)+"-"+count;
         count++;
         return id;
    }
    public Customer(){
        custID=generateId();
    }
    public String getId(){
        return custID;
    }
 
    }
public class StaticPractice5 {


    public static void main(String[] args) {
       Customer c=new Customer();
       System.out.println(c.getId());
    }
    
}
