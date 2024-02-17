// Write a java program to print even numbers between 1 to 100
package looppractice17;

public class LoopPractice17 {

    public static void main(String[] args) {
        int i,j;
        System.out.println("The even numbers between 1 to 100 are:");
        for(i=1;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    
}
