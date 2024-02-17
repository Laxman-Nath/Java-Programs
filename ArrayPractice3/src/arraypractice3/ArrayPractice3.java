// Write a java program for searching element in array
package arraypractice3;
import java.util.Scanner;

public class ArrayPractice3 {


    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6,78};
        int search,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element to be searched:");
        search=sc.nextInt();
        for( i=0;i<A.length;i++){
            if(A[i]==search){
                System.out.println("Element "+search+" is found at position "+ (i+1));
                System.exit(0);
            }
        }
     
             System.out.println("Element "+search+" is not  found ");
    }
    
}
