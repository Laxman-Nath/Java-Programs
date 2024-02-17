
package celsiuistofaeh;
import java.util.Scanner;

public class CelsiuisToFaeh {
    public static void main(String[] args) {
      float celsius,farheneit;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter temperature in celsius:");
        celsius=sc.nextFloat();
       farheneit=(celsius*9/5)+32;
       System.out.println("The temperature in fahrenheit is:"+farheneit+" degree F");
      
    }
    
}
