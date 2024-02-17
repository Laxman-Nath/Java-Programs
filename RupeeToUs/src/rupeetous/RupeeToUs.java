
package rupeetous;
import java.util.Scanner;

public class RupeeToUs {


    public static void main(String[] args) {
       float Rs,dollars;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter amount in nepali:");
       Rs=sc.nextFloat();
       dollars=Rs*0.0076f;
       System.out.println("The amount in dollars is:"+dollars);
    }
    
}
