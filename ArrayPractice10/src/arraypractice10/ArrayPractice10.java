// Write a java program to copy an array into another array
package arraypractice10;

public class ArrayPractice10 {

   
    public static void main(String[] args) {
      int A[]={1,2,3,4,5,6,7,8};
      int B[]=new int[10];
      for(int i=0;i<A.length;i++){
          B[i]=A[i];
    }
      for(int i=0;i<A.length;i++){
          System.out.println(B[i]);
      }
      }
    
}
