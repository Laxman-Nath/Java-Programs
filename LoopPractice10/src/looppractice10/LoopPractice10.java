//  Write a program to check whether the number is palindrome or not
package looppractice10;
import java.util.Scanner;
public class LoopPractice10 {

   
    public static void main(String[] args) {
        int n,temp,rem,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        temp=n;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
//        System.out.println(rev);
        if(rev==temp){
            System.out.println(+temp+" is palidrome number:");
        }
        else{
            System.out.println(+temp+" is not palidrome number:");
        }

    }
    
}
