// Find person is young or not
package youngornot;
import java.util.Scanner;
public class YoungOrNot {

    
    public static void main(String[] args) {
       byte age;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your age:");
       age=sc.nextByte();
       if(age>=18  && age <=40){
           System.out.println("You are young");
       }
       else{
           System.out.println("You are not young");
       }
    }
    
}
