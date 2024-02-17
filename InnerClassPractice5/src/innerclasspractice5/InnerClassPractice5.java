// Illustrating the static inner class in java
package innerclasspractice5;
class Outer{
    static int x=10;
    int y=20;
    static class Inner{
        void display(){
            System.out.println("The value of x is:"+x);
//            System.out.println("The value of y is:"+y);->Non-static variable cannot be accesssed from static class
        }
    }
}
public class InnerClassPractice5 {

    public static void main(String[] args) {
      Outer.Inner i=new Outer.Inner();
      i.display();
    }
    
}
