// Make a menu driven program for arithmetic operations using switch in java
package switchpractice5;
import java.util.Scanner;
public class SwitchPractice5 {
    public static void main(String[] args) {
        System.out.println("ADD:");
        System.out.println("SUB:");
        System.out.println("MUL:");
        System.out.println("DIV:");
        System.out.println("MOD:");
        int a,b;
        String choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers :");
        a=sc.nextInt();
        b=sc.nextInt();
        sc. nextLine();
        System.out.println("Enter your choice from menu:");
        choice=sc.nextLine();
        choice=choice.toUpperCase();
      
        switch(choice){
            case "ADD":
                System.out.println("The sum of "+a+" and "+b+" is:"+ (a+b));
                break;
            case "SUB":
                System.out.println("The difference of "+a+" and "+b+" is:"+ (a-b));
                break;
            case "MUL":
                System.out.println("The multlipication of "+a+" and "+b+" is:"+ (a*b));
                break;
            case "DIV":
                System.out.println("The division of "+a+" and "+b+" is:"+ (a/b));
                break;
            case "MOD":
                System.out.println("The modulo of "+a+" and "+b+" is:"+ (a%b));
                break;
            default:
                System.out.println("Invalid choice:");
        }
    }
    
}
