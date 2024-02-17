// Handling Exception with the help of nested try-catch block
package exceptionhandpractice4;


public class ExceptionHandPractice4 {

   
    public static void main(String[] args) {
        try{
            int A[]={10,0,8,3,5};
             System.out.println("Element at 10th index is:"+A[10]);
                    try{
                        int r=A[0]/A[1];
                        System.out.println("Results:"+r);
                    }
                    catch(ArithmeticException e){
                        System.out.println(e);
                    }
//                    System.out.println("Element at 10th index is:"+A[10]);
                    }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    
}
