// Tower of hanoi code in java
package toh;
import java.util.Scanner;


public class TOH {

   static void TOH(int n,char A,char B ,char C){
  if(n==1){
      System.out.println("Move disk "+n+" from "+A+" to "+C);
  }
  else{
      TOH(n-1,A,C,B);
      System.out.println("Move disk "+n+" from "+A+" to "+C);
      TOH(n-1,B,A,C);
  }
   }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n;
       System.out.println("Enter number of disks:");
       n=sc.nextInt();
       TOH(n,'A','B','C');
    }
    
}
