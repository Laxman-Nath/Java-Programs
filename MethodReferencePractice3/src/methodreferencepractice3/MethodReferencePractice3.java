// Method reference in java
package methodreferencepractice3;
interface myLambda {
    public void display(String str);
}
public class MethodReferencePractice3 {
    public void reverse(String str) {
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
        
    public static void main(String[] args) {
      MethodReferencePractice3 m1=new MethodReferencePractice3();
      myLambda m2=m1::reverse;
      m2.display("Hello");
    }
    
}
