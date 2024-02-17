// Integer wrapper class practice
package wrapperclasspractice2;

public class WrapperClassPractice2 {

   
    public static void main(String[] args) {
       int  m1=15;
       Integer m2=m1;
       System.out.println(m2.equals(m1));// compares value
       Integer m3=15;
       System.out.println(m2.equals(m3));
       Integer m4=Integer.valueOf(("100"));// converts string to int
       Integer m5=Integer.valueOf("1010", 2);
       System.out.println(m5);
       Integer m6=Integer.valueOf("A7", 16);
       System.out.println(m6);
       Integer m7=Integer.decode("0xA7");
       System.out.println(m7);
       System.out.println(Integer.parseInt("123"));
       System.out.println(Integer.toBinaryString(10));
              
    }
    
}
