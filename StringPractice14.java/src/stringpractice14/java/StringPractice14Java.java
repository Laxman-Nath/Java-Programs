// Write a java program to sort string in alphabetical order
package stringpractice14.java;
import java.util.Arrays;
public class StringPractice14Java {

   
    public static void main(String[] args) {
        String str="rock";
        // Method 1: without using sort method
//        char A[]=str.toCharArray();
//        char temp;
//        for(int i=0;i<A.length;i++){
//            for(int j=i+1;j<A.length-i-1;j++){
//                if(A[i]>A[j]){
//                    temp=A[i];
//                    A[i]=A[j];
//                    A[j]=temp;
//                }
//            }
//        }
//        System.out.println(new String(A));

     // Method 2:using sort method
     char A[]=str.toCharArray();
     Arrays.sort(A);
     System.out.println(new String(A));
     
    }
    
}
