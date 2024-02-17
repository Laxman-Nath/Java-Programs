// lambda expression accessing varible of class in which it is defined
package lambdaexpressionpractice6;
@FunctionalInterface
interface  myLambda{
    public void display();
}
class demo
{
    int x;
    public void show(){
        myLambda m=()->
        { 
            x++;
            System.out.println("The value of x of class variable is:"+x);
        };
                m.display();
                }
}
public class LambdaExpressionPractice6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
