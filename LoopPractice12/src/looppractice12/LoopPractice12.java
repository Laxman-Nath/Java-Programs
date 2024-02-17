// Write a java program to display A.P series
package looppractice12;
import java.util.Scanner;
public class LoopPractice12 {


    public static void main(String[] args) {
        int a,d,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a starting number:");
        a=sc.nextInt();
        System.out.println("Enter common difference:");
        d=sc.nextInt();
        System.out.println("Enter number of numbers:");
        n=sc.nextInt();
        int i=1;
        System.out.println("The arithmetic progression series is:");
        while(i<=n){
            System.out.print(a+" ,");
            a=a+d;
            i++;
        }
    }
    
}
