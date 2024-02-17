// Find radix of a number given in a string
package radixofnumber;
import java.util.Scanner;
public class RadixOfNumber {
 public static void main(String[] args) {
       String str;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number :");
       str=sc.nextLine();
         if(str.matches("[01]+")){
           System.out.println("The radix of number is 2");
       }
        else if(str.matches("[0-7]+")){
           System.out.println("The radix of number is 8");
       }
      
       else if(str.matches("[0-9]+")){
           System.out.println("The radix of number is 10");
       }
      
       else if(str.matches("[0-9A-F]+")){
           System.out.println("The radix of number is 16");
       }
       else{
           System.out.println("Invalid number");
       }
    }
    
}
