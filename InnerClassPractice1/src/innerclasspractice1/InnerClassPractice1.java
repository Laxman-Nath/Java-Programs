// Illustrating the nested inner class in java
package innerclasspractice1;
class Outer{
    int x=20;
//     Inner i=new Inner();  i is available in whole class
    class Inner{
        int y=10;
        void innerDisplay(){
            System.out.println("The value of x is:"+x); // Outer class variables(static also) can be accesssed inside inner class
            System.out.println("The value of y is:"+y);
        }
    }
    void outerDisplay(){
        Inner i=new Inner(); // i is available inside outerdisplay method only
        i.innerDisplay();
        System.out.println(i.y); // Inner class variables cannot be accessed directly
    }
}

public class InnerClassPractice1 {

   
    public static void main(String[] args) {
        Outer o=new Outer();
        o.outerDisplay();
        Outer.Inner i=new Outer().new Inner(); // Inner class cannot be created directly inside main method
        i.innerDisplay();
    }
    
}
