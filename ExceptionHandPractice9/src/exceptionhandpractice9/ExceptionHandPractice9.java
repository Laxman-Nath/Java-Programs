// Throw vs throws in java
package exceptionhandpractice9;

public class ExceptionHandPractice9 {
  static int area(int l,int b) throws Exception{
if(l<0 || b<0){
throw new Exception("Dimensions cannot be negative:");
} 
return l*b;
}
  static void meth2() throws Exception{
      int a=area(1,-2);
      System.out.println(a);
  }
    public static void main(String[] args) {
        try{
        meth2();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
