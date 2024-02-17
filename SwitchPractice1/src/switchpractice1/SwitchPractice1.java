// Write a java program to print numbers 1,2,3... using switch case
package switchpractice1;
import java.util.Scanner;

public class SwitchPractice1 {
public static void main(String[] args) {
//    float n; switch does not work with float
//       byte n;
//       int n;
//       short n;
     String str="1";
       
//       Scanner sc=new Scanner(System.in);
//       System.out.println("Enter a number :");
//       n=sc.nextInt();
       switch(str){
           case "1":
               System.out.println("One");
               break;
           case "2":
               System.out.println("Two");
               break;
           case "3":
               System.out.println("Three");
               break;
           default:
               System.out.println("Invalid number");
       }
    }
    
}
