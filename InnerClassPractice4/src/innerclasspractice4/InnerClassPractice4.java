// Illustrating the anonymous inner class in java
package innerclasspractice4;
interface My{
    void display();
}

class Outer{
    void meth1(){
//        My m=new My(){
//            public void display(){
//                System.out.println("Hello:");
//            }
//        };
//   m.display();
      new My(){
          public void display(){
              System.out.println("Hello");
          }
    }.display();
}
}
public class InnerClassPractice4 {

    public static void main(String[] args) {
        Outer o=new Outer();
        o.meth1();
    }
    
}
