// Method reference in java
package methodreferencepractice1;
@FunctionalInterface
interface myLambda {
    void display(String str);
}

public class MethodReferencePractice1 {

    
    public static void main(String[] args) {
        myLambda l=System.out::println;
        l.display("Hello");
    }
    
}
