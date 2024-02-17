// Write a java program to count digits of a number
package looppractice7;
import java.util.Scanner;

public class LoopPractice7 {

    
    public static void main(String[] args) {
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        int temp=n;
         while(n>0){
            n=n/10;
            count++;
            }
        System.out.println("The number of digits in "+temp+" is "+count);
        
        
    }
    
}
