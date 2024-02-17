// Write a recursive java program to print the sum of natural numbers
package recursionpractice4;

public class RecursionPractice4 {

   static int sum(int n){
       if(n==0){
           return 0;
       }
       else
       {
           return n+sum(n-1);
       }
   }
    public static void main(String[] args) {
        System.out.println("The sum is:"+sum(5));
    }
    
}
