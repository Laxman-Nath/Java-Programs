
package typeconversion;

import java.util.Scanner;


public class TypeConversion {


    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
      
       // Type casting
        /*int num=(int) (67.56);
       System.out.println(num);*/
       
       // automatic type promotion in expressions
          /*int num2=257;
             int num3=258;
             byte a=(byte) num2; // 257 % 256=1
             byte b=(byte) num3;
             System.out.println(a);
             System.out.println(b);
          */
        /*    byte a=40;
                byte b=50;
               byte c=100;
             int res=a*b/c;
             System.out.println(res);
            The result of a*b is beyond the capacity of byte so java is automatically promoting the result of a*b to int.
            This process is called automatic type promotion.In above expression it is happening because we are storing
            the result of this expression in int.
       */
        
    /*    byte d=50;
        d=d*2;*   this is not allowed as result of d*2 will be int ant byte cannot hold int*/



// Automatic type conversion
     
      /*  int number='A';
        System.out.println(number);
*/
      
 byte b=42;
 char c='a';
 short s=1024;
 int i=50000;
 float f=5.67f;
 double d=0.1234;
 double result=(f*b)+(i/c)-(d-s);
 System.out.println((f*b)+" "+(i/c)+" "+(d-s));
 System.out.println(result);
                
          
    }
    
}
