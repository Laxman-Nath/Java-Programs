
package poundtokg;
import java.util.Scanner;


public class PoundToKg {


    public static void main(String[] args) {
     float pound,kg;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter weight in pound:");
     pound=sc.nextFloat();
     kg=pound/2.2f;
     System.out.println("The weight in pound is:"+kg+" kgs");
     
     
    }
    
}
