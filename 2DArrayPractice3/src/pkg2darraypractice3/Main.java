// Write a java program to take elements of 2-D array as input and display them
package pkg2darraypractice3;
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A[][]=new int[2][2];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of array:");
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("The elements of array are:");
        for(int x[]:A){
            for(int y:x){
                System.out.print(y+" ");
            }
             System.out.println();
        }
    }
    
}
