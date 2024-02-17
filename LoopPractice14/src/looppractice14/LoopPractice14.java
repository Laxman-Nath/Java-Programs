// Write a java program to display fibonacci series
package looppractice14;
import java.util.Scanner;
public class LoopPractice14 {

    public static void main(String[] args) {
        int a=0,b=1,c,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
         System.out.print(a+","+b+" ,");
        for(int i=0;i<n-2;i++){
            
             c=a+b;
             System.out.print(c+" ,");
             a=b;
             b=c;
             
            
             
        }
    }
    
}
