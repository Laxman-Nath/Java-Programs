// Throw vs throws in java
package exceptionhandpractice8;

public class ExceptionHandPractice8 {
  static int area(int l,int b)throws Exception{
      if(l<0 || b<0 ){
          throw new Exception("Dimensions cannot be negative:");
      }
      int a=l*b;
      return a;
  }
  
  static void meth2(){
        try{
      int a=area(10,-10);
      System.out.println("Area is:"+a);
}
  catch(Exception e){
    System.out.println(e);
}
  }
   
    public static void main(String[] args) {
       meth2();
    }
    
}
