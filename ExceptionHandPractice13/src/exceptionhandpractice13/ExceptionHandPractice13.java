// Finally block in java
package exceptionhandpractice13;

public class ExceptionHandPractice13 {


    public static void main(String[] args) {
        try{
            int c=2/0;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Final message:");
        }
    }
    
}
