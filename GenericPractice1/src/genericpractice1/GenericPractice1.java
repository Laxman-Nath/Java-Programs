// Introduction to generics in java
package genericpractice1;

public class GenericPractice1 {
    public static void main(String[] args) {
        Object obj=new String("hello");
//        System.out.println(obj);
//       obj=new Integer(100);
//       System.out.println(obj);
      String str=(String)obj;
      System.out.println(str);
    }
    
}
