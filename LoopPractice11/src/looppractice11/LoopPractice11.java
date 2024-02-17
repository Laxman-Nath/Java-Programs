// Write a java pogram to display a number in words even with tailing 0
package looppractice11;
import java.util.Scanner;
public class LoopPractice11 {
     public static void main(String[] args) {
       int n,rem;
       String str="";
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number:");
       n=sc.nextInt();
       while(n>0){
         rem=n%10;
         n=n/10;
         str=str + rem;
     }
//       System.out.println(str);
       char ch;
      System.out.println("The individual digits in number are:");
      for(int i=str.length()-1;i>=0;i--){
         ch=str.charAt(i);
        switch(ch){
            case '0':
                System.out.print("Zero ");
                break;
            case '1':
                System.out.print("One ");
                break;
            case '2':
                System.out.print("Two ");
                break;
            case '3':
                System.out.print("Three ");
                break;
            case '4':
                System.out.print("Four ");
                break;
             case '5':
                System.out.print("Five  ");
                break;
            case '6':
                System.out.print("Six ");
                break;
            case '7':
                System.out.print("Seven ");
                break;
            case '8':
                System.out.print("Eight ");
                break;
            case '9':
                System.out.print("Nine ");
                break;
            default:
                System.out.print("Invalid number:");
        }
}
}
       
    }
    

