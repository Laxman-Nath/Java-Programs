// Write a java program to reverse a number
package looppractice9;
import java.util.Scanner;
public class LoopPractice9 {

    public static void main(String[] args) {
        int n,rem,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        int temp=n;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        
        System.out.println("The reverse of a number:"+temp+" is "+rev);
        
    }
    
}
