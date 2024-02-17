// Introduction to lambda expression in java
// Lambda expression are used for defining anonyms(nameless) methods or functions
// they are defined with the help of interface
package lambdaexpressionpractice1;
@FunctionalInterface // It is a interface having only one method
interface MyLambda{
    public void display();
}
//class My implements MyLambda{
//    public void display(){
//        System.out.println("Hello world!");
//    }
//}

public class LambdaExpressionPractice1 {

    
    public static void main(String[] args) {
//       My m=new My();
//       MyLambda m=new My();
          MyLambda m=()-> {  System.out.println("Hello world!"); };
         
          
       m.display();
    }
    
}
