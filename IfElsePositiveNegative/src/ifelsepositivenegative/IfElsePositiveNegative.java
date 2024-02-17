// Write a program to detect a number entered by user is positive or negative using if else
package ifelsepositivenegative;
import java.util.Scanner;

public class IfElsePositiveNegative {
    public static void main(String[] args) 
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        if(n>=0){
            System.out.println(+n+" is positive:");
        }
        else{
            System.out.println(+n+" is negative:");
        }
    }
    
}
