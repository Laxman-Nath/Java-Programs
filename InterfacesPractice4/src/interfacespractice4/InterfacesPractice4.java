// Another example of Interfaces
package interfacespractice4;
interface Test{
   final static int X=20;
   public abstract void meth1();
   public abstract void meth2();
   public static void meth3(){
       System.out.println("Static method can have definition inside interfaces:");
   }
   private void meth6(){
       System.out.println("Private method also can have definition inside interfaces:");
   }
   default void meth5(){
       meth6();
       System.out.println("Default method can have definition inside interfaces:");
   }
}

interface Test2 extends Test{
    void meth4();
}

class My implements Test2{
    public void meth1(){
        System.out.println("Meth 1 of class");
    }
    public void meth2(){
        System.out.println("Meth 2 of class");
    }
    public void meth4(){
        System.out.println("Meth 4 of class");
    }
    public void meth5(){
        System.out.println("Meth 5 of class");
    }
}
public class InterfacesPractice4 {

    
    public static void main(String[] args) {
      My m=new My();
      System.out.println(Test.X);
      Test.meth3();
      m.meth5();
    }
    
}
