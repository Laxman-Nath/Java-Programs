// Generics in java
package genericpractice3;


public class GenericPractice3 <T> {
    T data[]=(T[]) new Object[3];
    
  
    public static void main(String[] args) {
     GenericPractice3 <String> gp=new GenericPractice3();
     gp.data[0]="Hello";
     gp.data[1]="Hi";
     gp.data[2]="World";
     String str=gp.data[0];
    }
    
}
