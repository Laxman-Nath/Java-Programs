// Display a day based on number
package ifelseday;
import java.util.Scanner;
public class IfElseDay {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a day number");
        number=sc.nextInt();
        if(number==1){
            System.out.println("It is sunday");
        }
         else if(number==2){
            System.out.println("It is monday");
        }
        else if(number==3){
            System.out.println("It is tuesday");
        }
        else if(number==4){
            System.out.println("It is wednesday");
        }
        else if(number==5){
            System.out.println("It is thursday");
        }
        else if(number==6){
            System.out.println("It is friday");
        }
        else if(number==7){
            System.out.println("It is saturday");
        }
        else{
            System.out.println("Invalid number");
        }
    }
    
}
