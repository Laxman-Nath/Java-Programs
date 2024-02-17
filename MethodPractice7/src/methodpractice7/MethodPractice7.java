// Write a java program to find the GCD or HCF of a number using method
package methodpractice7;
import java.util.Scanner;

public class MethodPractice7 {
  static int GCD(int x,int y){
      while(x!=y){
      if(x>y){
          x=x-y;
      }
      else if(x<y){
          y=y-x;
      }
      }
      return x;
  }
  
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("The gcd of "+a+" and "+b+" is "+GCD(a,b));
    }
    
}
