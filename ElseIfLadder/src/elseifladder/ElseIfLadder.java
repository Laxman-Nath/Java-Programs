// Write a program to find largest among three numbers using else if ladder
package elseifladder;
import java.util.Scanner;
public class ElseIfLadder {

    public static void main(String[] args) {
      int a,b,c;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter three numbers:");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      if(a>b && a>c){
          System.out.println("largest number:"+a);
      }
      else if(b>c){
          System.out.println("Largest number is:"+b);
      }
      else{
          System.out.println("Largest number is:"+c);
      }
      
    }
    
}
