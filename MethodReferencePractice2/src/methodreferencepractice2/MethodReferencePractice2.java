// Method reference in java
package methodreferencepractice2;
interface myLambda {
    void display(String str);
}
public class MethodReferencePractice2 {
static public void reverse(String str) {
    StringBuffer sb=new StringBuffer(str);
    sb.reverse();
    System.out.println(sb);
}
    
    public static void main(String[] args) {
       myLambda m=MethodReferencePractice2::reverse;
      m.display("Hello");
       
    }
    
}
