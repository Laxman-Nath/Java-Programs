// Write a java program to find maximum of numbers using varargs
package variableargumentspractice3;


public class VariableArgumentsPractice3 {

    static int max(int ...A){
        if(A.length==0) return Integer.MIN_VALUE;
         int max=A[0];

        for(int i=1;i<A.length;i++){
            if(A[i]>max)
                max=A[i];
        }
        return max;
    }
    public static void main(String[] args) {
         System.out.println("The maximum number is:"+max());
         System.out.println("The maximum number is:"+max(1));
         System.out.println("The maximum number is:"+max(1,2));
         System.out.println("The maximum number is:"+max(1,2,3,4,5,6));
    }
    
}
