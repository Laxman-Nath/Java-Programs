// Find  a given year is leap year or not
package leapyear;
import java.util.Scanner;
public class LeapYear {

    public static void main(String[] args) {
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year:");
        year=sc.nextInt();
        if((year%4==0) &&(year%100!=0 || year%400==0)){
            System.out.println(+year+" is leap year:");
        }
        else{
            System.out.println(+year+" is not leap year:");
        }
           }
    
}
