/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circlearea;
import java.util.Scanner;

/**
 *
 * @author Aum com mnr
 */
public class CircleArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float radius;
        double area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle:");
        radius=sc.nextFloat();
        area=Math.PI*radius*radius;
        System.out.println("The area of a circle is:"+area);
        
    }
    
}
