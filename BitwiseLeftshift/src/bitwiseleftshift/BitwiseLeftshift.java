/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bitwiseleftshift;

/**
 *
 * @author Aum com mnr
 */
public class BitwiseLeftshift {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x=0b1010,y,z;
       y=x<<1;
       z=x<<2;
       System.out.println(Integer.toBinaryString(x));
       System.out.println(Integer.toBinaryString(y));
       System.out.println(Integer.toBinaryString(z));
       System.out.println(y);
       System.out.println(z);
       
    }
    
}
