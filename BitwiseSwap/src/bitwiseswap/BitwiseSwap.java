/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bitwiseswap;

/**
 *
 * @author Aum com mnr
 */
public class BitwiseSwap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a=9,b=12;
       System.out.println("Before performing swapping, the values of a,b are:"+a+","+b);
       a=a^b;
       b=a^b;
       a=a^b;
       System.out.println("After performing swapping, the values of a,b are:"+a+","+b);
    }
    
}
