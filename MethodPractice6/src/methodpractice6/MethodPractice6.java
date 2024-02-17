// Write a java program using method to check whether a number entered by user is prime or not
package methodpractice6;
import java.util.Scanner;
public class MethodPractice6 {

    static boolean isPrime(int n){
       
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0){
                return false;
            }
            
        }
        return true;
      
     }
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        number=sc.nextInt();
        if(isPrime(number)){
            System.out.println(number+" is prime number:");
        }
        else{
         System.out.println(number+" is not prime number:");
        }
    }
    
}
