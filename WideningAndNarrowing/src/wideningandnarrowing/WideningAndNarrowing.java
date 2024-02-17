/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wideningandnarrowing;

/**
 *
 * @author Aum com mnr
 */
public class WideningAndNarrowing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte b=10;
        short s=120;
        int i=10;
        long l=10;
        float f=10.6f;
        double d=10;
        char c=10;
        boolean b1=true;
        
//        s=b;
//        i=b;
//        l=b;
//        f=b;
////        c=b;  invalid because char and byte are incompatible
//       i=s;
//       l=s;
//       f=s;
//       d=s;
//       b=(byte)s; This is narrowing
//       System.out.println(b);

       i=(int)f; //not valid because f can contain decimal values which i cannot store
       System.out.println(i);
    
              
        
        
    }
    
}
