/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areaoft2;
import java.util.Scanner;

/**
 *
 * @author Aum com mnr
 */
public class Areaoft2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float a,b,c,s;
        double area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of 3 sides of a triangle:");
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        s=0.5f*(a+b+c);
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of a triangle is:"+area);
        
    }
    
}
