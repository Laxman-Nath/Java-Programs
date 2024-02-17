/// Write a java program for rotating an array
package arraypractice7;
public class ArrayPractice7 {

   
    public static void main(String[] args) {
       int A[]={1,2,3,4,5,6,7,8};
       int i,temp;
         // This is left rotation
//        temp=A[0];
//       for(i=0;i<A.length-1;i++){
//          A[i]=A[i+1];
//       }
//       A[A.length-1]=temp;
//       for(i=0;i<A.length;i++){
//           System.out.println(A[i]);
//       }

      // This is right rotation
         temp=A[A.length-1];
       for(i=A.length-1;i>=1;i--){
          A[i]=A[i-1];
       }
       A[0]=temp;
       for(i=0;i<A.length;i++){
           System.out.println(A[i]);
       }
    }
    
}
