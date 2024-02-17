// Write a java program to insert an element into an array
package arraypractice8;
import java.util.Scanner;

public class ArrayPractice8 {


    public static void main(String[] args) {
        int A[]=new int[10];
        A[0]=2;
        A[1]=3;
        A[2]=4;
        A[3]=5;
        A[4]=8;
       Scanner sc=new Scanner(System.in);
//       System.out.println(A.length);
       int i,index,element;
       System.out.println("Enter the index at which element is to be inserted:");
       index=sc.nextInt();
       System.out.println("Enter the element to be inserted:");
       element=sc.nextInt();
       for (i=4;i>=index;i--){
           A[i+1]=A[i];
       }
       A[index]=element;
       for(i=1;i<=5;i++){
           System.out.println(A[i]);
       }
       

    }
    
}
