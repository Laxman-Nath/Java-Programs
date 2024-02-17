// First example for interfaces
package interfacespractice1;
interface test{
    void meth1();
    void meth2();
}
// Interfaces are implemented not extended
 class sub implements test{
    public void meth1(){
        System.out.println("I'm meth1 of sub class:");
    }
   public void meth2(){
        System.out.println("I'm meth2 of sub class:");
    }
    void meth3(){
        System.out.println("I'm meth3 of sub class:");
    }
}
public class InterfacesPractice1 {

   
    public static void main(String[] args) {
       test t=new sub();
       t.meth1();// objects of interface cannot be created only reference can be created
       t.meth2();
    }
    
}
