// java.lang package in java
package javalangpackage;
import java.lang.*;
public class JavaLangPackage {

    
    public static void main(String[] args) {
       Object o1=new Object();
        Object o2=new Object();
        Object o3=o1;
        // These are some methods of Object class inside java.lang package
        System.out.println(o1.toString());
        System.out.println(o1);
        System.out.println(o2.toString());
        System.out.println(o2);
        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));
        System.out.println(o1.hashCode());
        System.out.println(o3.hashCode());
        System.out.println(o2.hashCode());
       
    }
    
}
