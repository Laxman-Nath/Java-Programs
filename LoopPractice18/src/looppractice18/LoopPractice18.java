// Write a java program to print odd numbers between 1 to 100
package looppractice18;

public class LoopPractice18 {

   
    public static void main(String[] args) {
       int i;
       System.out.println("The odd numbers from 1 to 100 are:");
       for( i=1;i<=100;i++){
           if(i%2!=0){
               System.out.println(i);
           }
       }
    }
    
}
