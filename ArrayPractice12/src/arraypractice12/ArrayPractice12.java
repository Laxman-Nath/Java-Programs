// Write a java progrm to increase the size of an array
// In java the size of array cannot be increased once it is created
package arraypractice12;

public class ArrayPractice12 {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,66};
        int B[]=new int[2*A.length];
        for(int i=0;i<A.length;i++){
            B[i]=A[i];
        }
        A=B;
        B=null;
        A[6]=8;
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
    }
    
}
