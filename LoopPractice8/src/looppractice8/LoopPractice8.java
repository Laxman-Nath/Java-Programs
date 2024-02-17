// Write a java program to check whether the entered number is amstrong or not
package looppractice8;
import java.util.Scanner;
public class LoopPractice8 {

    public static void main(String[] args) {
       int n,d,a=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number:");
       n=sc.nextInt();
       int temp=n;
        while(n>0){
            d=n%10;
            a=a+(d*d*d);
            n=n/10;
            }
        
        if(temp==a){
            System.out.println(+temp+" is amstrong number:");
        }
        else{
            System.out.println(+temp+" is not amstrong number:");
        }
    }
    
}
