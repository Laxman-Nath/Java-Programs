// Write a java program to display digits of a number
package looppractice6;
import java.util.Scanner;
public class LoopPractice6 {

    public static void main(String[] args) {
        int n,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        System.out.println("The digits of a number are:");
        while(n>0){
            d=n%10;
            System.out.println(d);
            n=n/10;
            }
        
    }
    
}
