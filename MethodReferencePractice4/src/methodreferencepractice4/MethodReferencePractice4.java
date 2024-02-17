// Method reference in java
package methodreferencepractice4;

interface myLambda {
    public void display(String str);
}
public class MethodReferencePractice4 {
public MethodReferencePractice4(String str){
    System.out.println(str);
}

    public static void main(String[] args) {
        myLambda m=MethodReferencePractice4::new;
         m.display("Hello");
    }
    
}
