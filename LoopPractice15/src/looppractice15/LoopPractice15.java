// Write a java program to display prime numbers between 100 to 500
package looppractice15;


public class LoopPractice15 {

    public static void main(String[] args) {
        int i,j;
        System.out.println("The prime numbers number between 100 to 500 are:");
        for( i=100;i<=500;i++){
            for( j=2;j<=i;j++){
                if(i%j==0){
                    break;
                }
            }
            if(i==j){
                System.out.println(i);
            }
        }
        }
    }
    

