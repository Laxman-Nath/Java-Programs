// Handling exception with the help of multiple catch and singe try blocks
package exceptionhandpractice3;

public class ExceptionHandPractice3 {

    public static void main(String[] args) {
        try{
            int A[]={10,0,8,3,5};
            int r=A[0]/A[1];
            System.out.println("Result is:"+r);
            System.out.println("Element at index 10 is"+A[10]);
        }
        
//        catch(Exception e){
//            System.out.println(e);
//        }
        
        catch(ArithmeticException e){
//            System.out.println(e);
              System.out.println("Denominator should not be zero:");
        }
         catch(ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
              System.out.println("Index is invalid:");
        }
        System.out.println("End of a program");
    }
    
}
