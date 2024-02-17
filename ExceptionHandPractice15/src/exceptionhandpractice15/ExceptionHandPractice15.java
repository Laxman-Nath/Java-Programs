// Finally block in java
package exceptionhandpractice15;


public class ExceptionHandPractice15 {
static void meth1() throws Exception{
    try{
        throw new Exception();
    }
    finally{
        System.out.println("This statement will always be executed whether there is "
                + "an exception or not");
    }
}
    
    public static void main(String[] args) throws Exception {
        meth1();
    }
    
}
