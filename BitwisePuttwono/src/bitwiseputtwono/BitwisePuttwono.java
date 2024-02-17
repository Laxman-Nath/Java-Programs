/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// Combine two numbers in one byte number
package bitwiseputtwono;

/**
 *
 * @author Aum com mnr
 */
public class BitwisePuttwono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       byte a=5,b=9;
       byte c=0;
       c=(byte)(c|a);
       b=(byte)(b<<4);
       c=(byte)(c|b);
       System.out.println((c&0b11110000)>>4);
       System.out.println((c&0b00001111));
       
    }
    
}
