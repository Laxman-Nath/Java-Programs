
package mangoprice;
import java.util.Scanner;

public class MangoPrice {

    
    public static void main(String[] args) {
      float dozenprice,nmangoes,nprice;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter price of one dozen mangoes:");
      dozenprice=sc.nextFloat();
      System.out.println("Enter number of mangoes whose cost is to be found:");
      nmangoes=sc.nextFloat();
      nprice=(nmangoes/12)*dozenprice;
      System.out.println("The cost of "+ nmangoes+" mangoes is: "+nprice);
      
    }
    
}
