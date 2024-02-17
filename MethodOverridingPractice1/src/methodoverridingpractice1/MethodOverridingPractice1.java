// Illustrating the use of method overriding in java
package methodoverridingpractice1;
class Super{
    void display(){
        System.out.println("Hello from super class:");
    }
}
class Sub extends Super{
    void display(){
        System.out.println("Hello welcome from sub class:");
    }
}
public class MethodOverridingPractice1 {

    
    public static void main(String[] args) {
        Super su=new Super();
        Sub sb=new Sub();
        su.display();
        sb.display();
        
    }
    
}
