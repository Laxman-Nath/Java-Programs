// Write a java program to find factorial of a number
package looppractice5;
import java.util.Scanner;
public class LoopPractice5 {

    public static void main(String[] args) {
       int n,fact=1;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
       n=sc.nextInt();
       for(int i=1;i<=n;i++){
           fact=fact*i;
       }
       System.out.println("The factorial of a "+n+" is:"+fact);
    }
    
}
