// Write a java program for finding maximum element in an array
package arraypractice4;
import java.util.Scanner;
public class ArrayPractice4 {

   
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6,7,89};
        int maximum=A[0];
//        System.out.println(A[1]);
        for(int i=1;i<A.length;i++ ){
            if(A[i]>maximum){
                maximum=A[i];
            }
        }
        System.out.println("Maximum number:"+maximum);
    }
    
}
