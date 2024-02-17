// Write a program to print composite numbers between 100 to 500
package looppractice16;


public class LoopPractice16 {

   
    public static void main(String[] args) {
        
        int i,j;
        System.out.println("The composite numbers betweeen 100 to 500 are:");
        for(i=100;i<=500;i++){
            for(j=2;j<=i;j++){
                if(i%j==0){
                    break;
                }
            }
            if(j!=i){
                System.out.println(i);
            }
            }
    }
    
}
