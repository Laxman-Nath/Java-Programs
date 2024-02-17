// Write a java program using method to find largest number among two numbers.
package methodpractice1;
import java.util.Scanner;
public class MethodPractice1 {
//     int max(int x,int y){
//        if(x>y){
//            return x;
//        }
//        else
//        {
//            return y;
//        }
    
   static int max(int x,int y){
        if(x>y){
            return x;
        }
        else
        {
            return y;
        }
   }
        
        static int inc(int x){
            x++;
            return x;
        }

    public static void main(String[] args) {
        int a,b;
        MethodPractice1 m=new MethodPractice1();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
//        System.out.println("The largest number is:"+m.max(a,b));
        System.out.println("The largest number is:"+max(a,b));
        System.out.println(inc(a));
        System.out.println(a);
        }
    
}
