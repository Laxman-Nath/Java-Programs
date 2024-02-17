// Lambda expression taking multiple parameters
package lambdaexpressionpractice3;
@FunctionalInterface
interface myLambda{
    public int add(int x,int y);
}
public class LambdaExpressionPractice3 {
    public static void main(String[] args) {
//        myLambda m=(a,b)->{ return a+b;};
//        System.out.println("The sum is:"+m.add(20,30));

        myLambda m=(a,b)->a+b;
        int s=m .add(2, 20);
        System.out.println("The sum is :"+s);
        
        
        
    }
    
}
