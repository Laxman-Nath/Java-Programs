// Write a program to find largest among three numbers using nested if
package nestedif;
import java.util.Scanner;
public class NestedIf {
public static void main(String[] args) {
         int a,b,c;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter three numbers:");
         a=sc.nextInt();
         b=sc.nextInt();
         c=sc.nextInt();
         if(a>b && a>c){
             System.out.println("Largest number is:"+a);
         }
         else{
             if(b>c){
                System.out.println("Largest number is:"+b);
             }
             else{
                 System.out.println("Largest number is:"+c);
             }
         }
    }
    
}
