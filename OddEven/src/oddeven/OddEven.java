// Find a number is odd or even
package oddeven;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
       int n;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       n=sc.nextInt();
       if(n%2==0){
           System.out.println(+n+" is even");
       }
       else{
           System.out.println(+n+" is odd");
       }
       
           
    }
    
}
