// Write a recursive java program to print fibonacci series
package recursionpractice5;


public class RecursionPractice5 {

    static int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        else
        {
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args) {
        System.out.println("The fibonacci series is:");
        for(int i=0;i<10;i++){
            System.out.println(fibo(i));
        }
    }
    
}
