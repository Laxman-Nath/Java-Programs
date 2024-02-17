// Find grades for marks of three subjects
package grades;
import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
       float m1,m2,m3,total,avg;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter marks in three subjects:");
       m1=sc.nextFloat();
       m2=sc.nextFloat();
       m3=sc.nextFloat();
       total=m1+m2+m3;
       avg=total/3.0f;
       if(avg>=70){
           System.out.println("Your grade is A:");
       }
       else if(avg>=60 && avg<70){
           System.out.println("Your grade is B");
       }
       else if(avg>=50 && avg<60){
        System.out.println("Your grade is C");
    }
        else if(avg>=40 && avg<50){
        System.out.println("Your grade is C");
    
        }
        else{
            System.out.println("Your grade is E");
        }
           
    }
    
}
