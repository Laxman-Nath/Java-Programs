// Lambda expressions taking single parameters
package lambdaexpressionpractice2;
@FunctionalInterface
interface myLambda{
    void display(String s);
}
public class LambdaExpressionPractice2 {

    
    public static void main(String[] args) {
        myLambda m=(s)->{ System.out.println(s); };
                m.display("Java programming");
    }
    
}
