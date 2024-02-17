/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unsignedrightshift;

/**
 *
 * @author Aum com mnr
 */
public class UnsignedRightshift {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x=-0b1010,y,z;
       z=x>>1;
       y=x>>>1;
       System.out.println(String.format(Integer.toBinaryString(x)));
       System.out.println(String.format("%32s",Integer.toBinaryString(y)));
       System.out.println(String.format(Integer.toBinaryString(z)));
       System.out.println(z);
       System.out.println(y);
    }
    
}
