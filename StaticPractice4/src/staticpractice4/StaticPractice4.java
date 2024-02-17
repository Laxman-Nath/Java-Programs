
package staticpractice4;
import java.util.*;
class Account{
    private String accNo;
    private static int  count=1;
    private String generateAccNo(){
        Date d=new Date();
        String an="NMB-"+(d.getYear()+1900)+"-"+count;
        count++;
        return an;
    }
   public Account(){
        accNo=generateAccNo();
   }
   public String getAccNo(){
       return accNo;
   }
}
public class StaticPractice4 {
    public static void main(String[] args) {
        Account a=new Account();
         Account b=new Account();
          Account c=new Account();
          System.out.println(a.getAccNo());
          System.out.println(b.getAccNo());
          System.out.println(c.getAccNo());
    }
    
}
