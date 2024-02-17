// Throw vs throws in java
package exceptionhandpractice11;

public class ExceptionHandPractice11 {
static int meth1(){
    return 10/0;
}
static void meth2(){
    meth1();
}
static void meth3(){
    try{
    meth2();
    }
    catch(Exception e){
        System.out.println(e);
    }
}
  
    public static void main(String[] args) {
        meth3();
    }
    
}
