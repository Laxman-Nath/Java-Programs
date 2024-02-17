// Handling exception with the help of try and catch block
package exceptionhandpractice2;

import java.util.Scanner;

public class ExceptionHandPractice2 {

   
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of  a and b:");
        a=sc.nextInt();
        b=sc.nextInt();
        try{
        c=a/b;
        System.out.println("Result is:"+c);
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero:"+e);
        }
        System.out.println("Bye:");
       
        
    }
    
}
