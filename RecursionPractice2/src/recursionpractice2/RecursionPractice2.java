// Write a recursive java program to print numbers from 1 to 10
package recursionpractice2;

public class RecursionPractice2 {

   static void func(int n){
       if(n>0){
           func(n-1);
           System.out.println(n);
       }
   }
    public static void main(String[] args) {
        func(10);
    }
    
}
