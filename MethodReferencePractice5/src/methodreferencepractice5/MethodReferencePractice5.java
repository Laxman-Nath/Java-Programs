// Method reference in java
package methodreferencepractice5;
interface  myLambda{
    public int display(String str1,String str2);
}
public class MethodReferencePractice5 {


    public static void main(String[] args) {
        myLambda m1=String::compareTo;
        System.out.println(m1.display("hello", "Hello"));
    }
    
}
