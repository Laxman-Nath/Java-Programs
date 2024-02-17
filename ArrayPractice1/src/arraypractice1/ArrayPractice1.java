// Introduction to arrays
package arraypractice1;


public class ArrayPractice1 {

   
    public static void main(String[] args) {
      // Declaring an array
      int A[]=new int[10];  // This larger bracket can be given before or after the array name
      int B[]={1,2,4,5,6};
      int C[];
      C=new int[10];
      B[2]=15;
      
      // Displaying the  array elements
      // Using for loop
//      int i;
//      for( i=0;i<A.length;i++ ){
//          System.out.println(A[i]);
//    }
      
      // Using for each loop
//      for(int x:B){
//          System.out.println(x++);
//      }
//      for(int x:B){
//          System.out.println(x);
//      }
   
       for(int i=0;i<B.length;i++ ){
          System.out.println(B[i]++);
    }
         for(int i=0;i<B.length;i++ ){
          System.out.println(B[i]);
    }
    }
    
}
