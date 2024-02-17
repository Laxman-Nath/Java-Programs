// Write a java program to find sum of n natural numbers numbers
package looppractice4;
import java.util.Scanner;

public class LoopPractice4 {

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        int i=1,sum=0;
        while(i<=n){
            sum+=i;
            i++;
            }
        System.out.println("The sum of numbers from 1 to "+n+" is:"+sum);
    }
    
}
