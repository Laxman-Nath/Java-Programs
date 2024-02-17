// Write a java program to delete the element from an array
package arraypractice9;
import java .util.Scanner;

public class ArrayPractice9 {

   
    public static void main(String[] args) {
        int A[]=new int[10];
        A[0]=5;
        A[1]=9;
        A[2]=6;
        A[3]=10;
        A[4]=12;
        A[5]=7;
        int index;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index at which element is to be deleted:");
        index=sc.nextInt();
        for(i=index;i<5;i++){
            A[i]=A[i+1];
        }
        System.out.println("The elements of array are:");
                for( i=0;i<5;i++){
                    System.out.println(A[i]);
                }
                    
        
    }
    
}
