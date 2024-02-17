
package simpleinterest;
import java.util.Scanner;


public class SimpleInterest {


    public static void main(String[] args) {
       float principal,time,rate,si;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter principal,time and rate:");
       principal=sc.nextFloat();
       time=sc.nextFloat();
       rate=sc.nextFloat();
       si=(principal*time*rate)/100.0f;
       System.out.println("The simple interest is:"+si);
    }
    
}
