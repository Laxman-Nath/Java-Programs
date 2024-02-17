/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package squarearea;
import java.util.Scanner;

/**
 *
 * @author Aum com mnr
 */
public class SquareArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float a;
       float area;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the side of triangle:");
       a=sc.nextInt();
       area=a*a;
       System.out.println("The area of square is:"+area);
       
    }
    
}
