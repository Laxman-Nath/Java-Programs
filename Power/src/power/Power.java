
package power;
import java.util.Scanner;
public class Power {


    public static void main(String[] args) {
       int number,power;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number whose power is to be find:");
       number=sc.nextInt();
       System.out.println("Enter a power of a number:");
       power=sc.nextInt();
       System.out.println("The "+power+" power of "+number+" is :"+Math.pow(number,power));
    }
    
}
