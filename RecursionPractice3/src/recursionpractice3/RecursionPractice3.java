// Write a recursive java program to find factorial of a number
package recursionpractice3;

public class RecursionPractice3 {

   static int fact(int n){
       if(n==0){
           return 1;
       }
       else {
           return n*fact(n-1);
       }
   }
    public static void main(String[] args) {
       System.out.println("The factorial is:"+fact(1));
    }
    
}
