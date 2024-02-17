// Some rules for abstract class
//1).Abstract classes and methods cannot be final and static
//2).The class which extends abstract class must override abstract methods of super class or either be declared
// as abstract
// 3).The object of abstract class cannot be created but it's reference cannot be created
// 4).Abstract class are meant for subclasses only.They provide standards for subclasses

package abstractclassspractice5;
abstract class Super{
   abstract public void meth1();
}
abstract class Sub extends Super{
}
public class AbstractClasssPractice5 {

    public static void main(String[] args) {
    }
    
}
