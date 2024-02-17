// Write a java program to print the sum of all elements of array
package arraypractice2;
import java.util.Scanner;

public class ArrayPractice2 {

    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<A.length;i++){
            A[i]=sc.nextInt();
        }
        System.out.println("The array elements are:");
        for(int x:A){
            System.out.println(x);
        }
        for(int x:A){
            sum+=x;
        }
        System.out.println("The sum of all array elements are:"+sum);
        
            
    }
    
}
