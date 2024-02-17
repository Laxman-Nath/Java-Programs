// Write a java program for printing a reverse of a given string
package stringpractice10;
import java.util.Scanner;
public class StringPractice10 {
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        str=sc.nextLine();
        // First method
//        System.out.println("The reverse of a "+str+" is:");
//        for(int i=str.length()-1;i>=0 ;i--){
//            System.out.print(str.charAt(i));
//        }
//        System.out.println();

   //Second method
       char A[]=str.toCharArray();
        System.out.println("The reverse of a "+str+" is:");
        for(int i=A.length-1;i>=0 ;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
       
    }
    
}
