
package squareroot;
import java.util.Scanner;

public class SquareRoot {

    
    public static void main(String[] args) {
       int number;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number whose square root is to be find:");
       number=sc.nextInt();
       System.out.println("The square root of "+number+" is :"+Math.sqrt(number));
    }
    
}
