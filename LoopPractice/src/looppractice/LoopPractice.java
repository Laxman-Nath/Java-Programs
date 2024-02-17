// Write a java program to display G.P. Series
package looppractice;
import java.util.Scanner;

public class LoopPractice {

    public static void main(String[] args) {
        int a,r,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting number:");
        a=sc.nextInt();
        System.out.println("Enter common ratio:");
        r=sc.nextInt();
        System.out.println("Enter number of terms:");
        n=sc.nextInt();
        System.out.println("Displaying geometric progression:");
//        System.out.print(a+",");
//        for(int i=1;i<n;i++){
//          System.out.print( a* (int)(Math.pow(r,i))+",");
//        }

        for(int i=0;i<n;i++){
            System.out.print(a+" ,");
            a=a*r;
        }
        
    }
    
}
