// Write a java program to find maximum element in an array using method
package methodpractice8;


public class MethodPractice8 {

    static int max(int B[]){
        int max=B[0];
        for(int i=1;i<B.length;i++)
        {
          if(B[i]>max){
              max=B[i];
          }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6,7,8,9};
        System.out.println("The maximum element in an array is:"+max(A));
    }
    
}
