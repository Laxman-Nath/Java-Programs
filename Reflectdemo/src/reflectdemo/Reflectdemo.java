// Reflection or reflect package in java
package reflectdemo;
import java.lang.reflect.*;
class My{
    private int a;
    public int b;
    protected int c;
    int d;
    public My(){}
    public My(int x,int y){}
    public void display(String s1,String s2){
        
    }
    public int show(int x,int y){
        return 0;
    }
    
}

public class Reflectdemo {

   
    public static void main(String[] args) {
      Class c=My.class;
      Field  field[]=c.getDeclaredFields();
      Constructor cons[]=c.getConstructors();
      Method meth[]=c.getMethods();
      
//      My m=new My();
//      Class m2=m.getClass();

      System.out.println(c.getName());
      for(Field f:field){
          System.out.println(f);
      }
      for(Constructor f:cons){
          System.out.println(f);
      }
      for(Method f:meth){
          System.out.println(f);
      }
      
     Parameter p[]= meth[0].getParameters();
     for(Parameter f:p){
          System.out.println(f);
      }
    }
    
}
