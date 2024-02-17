/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quardaticroot;
import java.util.Scanner;
        
        

/**
 *
 * @author Aum com mnr
 */
public class QuardaticRoot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float a,b,c;
       double r1,r2;
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter the values of a,b and c of quardatic equation");
       a=sc.nextFloat();
       b=sc.nextFloat();
       c=sc.nextFloat();
       r1=(-b+(Math.sqrt(b*b-4*a*c)))/(2*a);
       r2=(-b-(Math.sqrt(b*b-4*a*c)))/(2*a);
       System.out.println("The values of roots of quardatic equation are: "+r1+" and "+r2);
    }
    
}
