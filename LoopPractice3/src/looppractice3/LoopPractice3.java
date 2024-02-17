// Write a java program to display multliplication table of a number entered by user
package looppractice3;
import java.util.Scanner;

public class LoopPractice3 {
   public static void main(String[] args) {
      int number;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number:");
      number=sc.nextInt();
      System.out.println("Using for loop,the multlipication table of "+number+" is");
      for(int i=1;i<=10;i++){
          System.out.println(+number+" X "+i+"="+(number*i));
      }
    }
    
}
