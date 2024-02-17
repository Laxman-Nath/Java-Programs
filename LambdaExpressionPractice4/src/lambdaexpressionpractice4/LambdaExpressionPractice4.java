// Creating local variables inside the lambda expression and accessing them
package lambdaexpressionpractice4;
interface myLambda{
    void display();
}
class demo{
    public void show(){
    myLambda m1=()->{
        int count=0;// Creating varible inside the lambda expression
        ++count; // Updating variables defined inside the lambda expression
        System.out.println("Hello ");
        System.out.println("Good morning "+count); // Accessing variables defined inside the lambda expression
    };
    m1.display();
    }
}


public class LambdaExpressionPractice4 {
    public static void main(String[] args) {
      demo d=new demo();
      d.show();
    }
    
}
