/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectanglearea;
import java.util.Scanner;

/**
 *
 * @author Aum com mnr
 */
public class RectangleArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float length,breadth,area;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter length and breadth of rectangle:");
       length=sc.nextFloat();
       breadth=sc.nextFloat();
       area=length*breadth;
       System.out.println("The area of rectangle is:"+area);
       
       
    }
    
}
