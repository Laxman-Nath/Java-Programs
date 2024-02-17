// Write a java program to input the array element from the user and display them using for each loop
package arraypractice6;
import java.util.Scanner;
public class ArrayPractice6 {

  
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<A.length;i++){
            A[i]=sc.nextInt();
        }
        System.out.println("The elements of array are:");
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
    
        
        
    }
    
}
