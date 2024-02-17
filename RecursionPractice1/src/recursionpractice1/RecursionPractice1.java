// Write a recursive program in java to print numbers from 10 to 1
package recursionpractice1;


public class RecursionPractice1 {
   static void func(int n){
       if(n>0){
           System.out.println(n);
           func(n-1);
       }
   }
    public static void main(String[] args) {
         func(10);
    }
    
}
