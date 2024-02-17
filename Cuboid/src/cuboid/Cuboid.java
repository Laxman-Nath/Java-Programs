/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuboid;
import java.util.Scanner;

/**
 *
 * @author Aum com mnr
 */
public class Cuboid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float l,b,h,totalarea,volume;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length,breadth and height of a cuboid:");
        l=sc.nextFloat();
        b=sc.nextFloat();
        h=sc.nextFloat();
        totalarea=2*(l*b+b*h+l*h);
        volume=l*b*h;
        System.out.println("The total area of cuboid is:"+totalarea);
        System.out.println("The volume of cuboid is:"+volume);
                
    }
    
}
