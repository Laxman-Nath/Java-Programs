// Implementing linear congruential method in java
package simulation1;
import java.util.Scanner;


public class Simulation1 {
  static void Linearcong(int x0,int a,int c,int m,int A[],int n){
      A[0]=x0;
     for(int i=1;i<n;i++){ 
     A[i]=((A[i-1]*a)+c)%m;
     }
  }
  
  static void display(int A[],int n){
      for(int i=0;i<n;i++){
            System.out.println(A[i]);
        }
  }
  
         
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the seed value:");
        int x0=sc.nextInt();
        System.out.println("Enter the modulus parameter:");
        int m=sc.nextInt();
        System.out.println("Enter increment term:");
        int c=sc.nextInt();
        System.out.println("Enter multlipier term:");
        int a=sc.nextInt();
        System.out.println("Enter number of random numbers to be generated:");
        int n=sc.nextInt();
        int A[]=new int[n];// Creating array for storing generated numbers
        Linearcong(x0,a,c,m,A,n);
        System.out.println("Displaying generated numbers:");
        display(A,n);
       
    }
    
}
