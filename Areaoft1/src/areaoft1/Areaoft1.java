/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package areaoft1;
import java.util.Scanner;

/**
 *
 * @author Aum com mnr
 */
public class Areaoft1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      float base, height, area;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter base of a triangle:");
      base=sc.nextFloat();
      System.out.println("Enter height of a triangle:");
      height=sc.nextFloat();
      area=0.5f*base*height;
      System.out.println("The area of a triangle is:"+area);
      
      
    }
    
}
