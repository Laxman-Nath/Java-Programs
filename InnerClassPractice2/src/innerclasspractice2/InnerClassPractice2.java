// Illustrating the Local inner class in java
package innerclasspractice2;

class Outer{
    public void display(){
    class Inner{ // This class is local to method display()
        void innerDisplay(){
            System.out.println("Hello! from inner class");
        }
    }
//    Inner i=new Inner();
//    i.innerDisplay();
      new Inner().innerDisplay();
    }
}
public class InnerClassPractice2 {

   
    public static void main(String[] args) {
       Outer o=new Outer();
       o.display();
    }
    
}
