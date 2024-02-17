// Passing lambda expression as parameter in java
package lambdaexpressionpractice7;
interface myLambda{
    public void display();
}
class useLambda{
    public void callLambda(myLambda m){
        m.display();
    }
}
class demo{
    public void show(){
        useLambda l=new useLambda();
        l.callLambda(()->{System.out.println("Hello world");});
    }
}
public class LambdaExpressionPractice7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new demo().show();
    }
    
}
