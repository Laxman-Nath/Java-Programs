// Write a program to print a string entered by user
package printstring;
import java.util.Scanner;

public class PrintString {

    
    public static void main(String[] args) {
       String str;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a string:");
       str=sc.nextLine();
       System.out.println("The string entered is:"+str);
        
    }
    
}
