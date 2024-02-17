// Creating user defined exception
package exceptionhandpractice10;
class NegativeDimensionException extends Exception{
    public String toString(){
        return "Dimension cannot be negative";
    }
}
public class ExceptionHandPractice10 {
static int area(int l,int b) throws NegativeDimensionException{
    if(l<0 || b<0){
        throw new NegativeDimensionException();
    }
    return l*b;
}
    public static void main(String[] args) throws NegativeDimensionException {
        area(2,3);
    }
    
}
