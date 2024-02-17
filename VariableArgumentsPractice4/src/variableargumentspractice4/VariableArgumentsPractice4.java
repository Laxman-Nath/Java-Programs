// Write a java program to find sum of all elements using varargs.
package variableargumentspractice4;


public class VariableArgumentsPractice4 {

   static int sum(int ...A){
       if(A.length==0) return 0;
      int sum=A[0];
       for(int i=1;i<A.length;i++){
           sum=sum+A[i];
       }
       return sum;
   }
    public static void main(String[] args) {
        System.out.println("The sum is:"+sum());
        System.out.println("The sum is:"+sum(1));
        System.out.println("The sum is:"+sum(1,2));
        System.out.println("The sum is:"+sum(1,2,3,4,5));
    }
    
}
