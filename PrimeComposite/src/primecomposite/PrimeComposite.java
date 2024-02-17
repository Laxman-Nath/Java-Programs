// Write a program to detect whether the number entered by user is prime or composite
package primecomposite;
import java.util.Scanner;
public class PrimeComposite {

    public static void main(String[] args) {
      int n,count=0;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a number:");
      n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
          if(n%i==0){
              count++;
          }
      }
      if(count==2){
          System.out.println(+n+" is prime number:");
      }
      else{
           System.out.println(+n+" is composite number:");
      }
    }
    
}
