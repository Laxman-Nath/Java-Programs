// Accessing variables of methods in which the lambda expression is defined
package lambdaexpressionpractice5;
interface myLambda{
    void display();
}
class demo{
    public void show(){
        int count=0;
        myLambda m=()->{System.out.println("Hi");
//       count++;  cannot be modified
        System.out.println("Have a nice day" +count); // accessing variables of method(This variable can only be
//        accessed if and only if it is final or it will not be modified in future)
        }
                m.display();
//                  count++; This cannot be modified here
        }
                
    }
        
}
    
public class LambdaExpressionPractice5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
